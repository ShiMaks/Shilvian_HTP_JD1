package by.makson.lesson4;

public class Main {

	public static void main(String[] args) {

		// Задача 1: Все элементы массива поделить на значение наибольшего элемента
		// этого массива.

		double[] array = creatArray(100);
		printArray(array);
		double[] divArray = divisionElemensArray(array);
		printArray(divArray);

		// Задача 2: Дан массив A вещественного типа, содержащий 20 положительных и
		// отрицательных элементов.
		// Сформировать массив B из положительных элементов массива A, имеющих четный
		// индекс.
		// Найти сумму квадратов элементов нового массива.
		
		double taskTwo = taskTwo(100);
		System.out.println("Сумма квадратов элементов равна: " + taskTwo);

		// Задача 3: Дана матрица (двумерный массив). Поменять местами две любые ее
		// строки.

		swapPlaces(1, 4);

		// Задача 4: Найти максимальный элемент для каждого столбца матриц размерностью
		// NxN.

		maxElementMatrix(5);

		// Задача 5: В двумерном массиве целых чисел определить, сколько раз в нем
		// встречается элемент со значением X.

		coincidenceNumber(15);

		// Задача 6: В двумерном массиве натуральных случайных чисел от 0 до 199
		// найти количество всех двузначных чисел, у которых сумма цифр кратна 2.

		multipleOfTwo();

	}

	private static double[] creatArray(int size) {
		double[] b = new double[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = (Math.random() * size);
		}
		return b;
	}

	private static void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println(" ");
	}

	private static double[] divisionElemensArray(double[] array) {
		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		double[] newArray = new double[array.length];
		for (int j = 0; j < newArray.length; j++) {
			newArray[j] = (array[j] / max);
		}
		return newArray;
	}

	private static double taskTwo(int size) {
		double[] a = new double[40];
		int count = 0;
		double summ = 0;
		for (int i = 0; i < a.length; i++) {
			if (i < 20) {
				a[i] = -1 * (Math.random() * size);
			} else if (i >= 20) {
				a[i] = (Math.random() * size);
			}
		}
		for (int k = 0; k < a.length; k++) {
			if (a[k] > 0 && k % 2 == 0) {
				count++;
			}
		}
		double[] b = new double[count];
		int iterB = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] > 0 && j % 2 == 0) {
				b[iterB] = a[j];
				summ = summ + (b[iterB] * b[iterB]);
				iterB++;
			}
		}
		return summ;
	}

	private static void swapPlaces(int a, int b) {
		int lineOne = a;
		int lineTwo = b;
		int[][] twoDimArray = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				twoDimArray[i][j] = (int) (Math.random() * 100);
			}
		}
		System.out.println("Заданнаый массив: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(twoDimArray[i][j] + " ");
			}
			System.out.println();
		}

		int[] temp = new int[5];
		for (int i = 0; i < 5; i++) {
			temp = twoDimArray[lineOne];
			twoDimArray[lineOne] = twoDimArray[lineTwo];
			twoDimArray[lineTwo] = temp;
			for (int j = 0; j < 4; j++) {

			}
		}
		System.out.println("/n");
		System.out.println("Массив с переставленными строками: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(twoDimArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void maxElementMatrix(int size) {
		int n = size;
		int[][] array = new int[n][n];
		int[] mac = new int[n];
		int max;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; i++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int j = 0; j < n; j++) {
			max = 0;
			for (int i = 0; i < n; i++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			mac[j] = max;
		}
		System.out.println("Максимальные элементы столбцов:");
		for (int i = 0; i < n; i++) {
			System.out.println(mac[i]);
		}
	}

	private static void coincidenceNumber(int number) {
		int[][] array = new int[15][15];
		int counter = 0;
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (array[i][j] == number) {
					counter++;
				}
			}
		}
		System.out.println("Количество совпадений: " + counter);
	}

	private static void multipleOfTwo() {
		int countNumber = 0;
		int[][] array = new int[15][15];
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 199);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if (array[i][j] > 9 && array[i][j] < 100) {
					int a = (array[i][j]) % 10;
					int b = (array[i][j] / 10) % 10;
					if ((a + b) % 2 == 0) {
						countNumber++;
					}
				}
			}
		}
		System.out.println("Количество всех двузначных чисел, у которых сумма цифр кратна 2: " + countNumber);

	}
}

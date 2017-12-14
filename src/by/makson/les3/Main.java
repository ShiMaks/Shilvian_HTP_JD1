package by.makson.les3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Задача 1: Заполнить массив размером 10 эл-ов случайными числами
		int[] array = creatArray(100);
		printArray(array);

		// Задача 2:Вывести из массива (задание 1) все четные эл-ты на экран
		evenNumber(array);

		 //Задача 3:Посчитать разность всех нечетных эл-ов масиива
		 summOddElement(array);
		
		 //Задача 4:Посчитать кол-во четных и нечетных эл-ов в массиве. Вывести их на экран
		 getNumberOfEvenElement(array);
		 getNumberOfOddElement(array);
		
		 //Задача 5:Найти и вывести на экран максимальный и минимальный эллемент
		 maxElementOfArray(array);
		 minElementOfArray(array);
		
		 //Задача 6:Найти максимальный и минимальный элемент среди четных\нечетных
		 //эл-ов массива
		 minAndMaxElementEvenArray(array);
		 minAndMaxElementOddArray(array);
		
		 //Задача 7:Сохранить в массив char свою фамилию и имя. Размер массива не
		 //должен превышать кол-во символов
		 System.out.println(getNameAndSurname());
		
		 //Задача 7.1:Реализовать считывание ФИО с клавиатуры
		 //fullNameKeyboard();
		
		 //Задача 8:Добавить в массив из задания 7 пробел и отчество
		 addPatrToName(getNameAndSurname());
		
		 //Задача 9, 9.1:Удалить из массива все эл-ты кратные 3-м. Привести размер
		 //массива в соответствие с реальным кол-вом хранимых элементов
		 int[] newArray = delElementsDivByThree(array);
		 System.out.println("Новый массив: ");
		 printArray(newArray);
		
		 //Задача 10:Отсортировать массив 2 способами
		 int[] sortBubble = sortingBoubble(array);
		 printArray(sortBubble);
		
		 int[] sortSelect = sortByChoise(array);
		 printArray(sortSelect);
		
		 int[] sortInsert = sortByInsert(array);
		 printArray(sortInsert);

		// Задача 11:Найти в массиве и вывести на экран все элементы в заданном диапазоне
		numericalRange(array, 80, 30);

	}

	// task 1
	private static int[] creatArray(int size) {
		int[] b = new int[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * size);
		}
		return b;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println(" ");
	}

	// task 2
	private static void evenNumber(int[] array) {
		System.out.print("Четные эл-ты массива: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + "\t");
			}
		}
	}

	// task 3
	private static void summOddElement(int[] array) {
		int summ = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				summ = summ - array[i];
			}
		}
		System.out.println("Разность нечетных элементов: " + summ);
	}

	// task 4
	private static void getNumberOfEvenElement(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count = count + 1;
			}
		}
		System.out.println("Кол-во четных чисел: " + count);
	}

	private static void getNumberOfOddElement(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				count = count + 1;
			}
		}
		System.out.println("Кол-во нечетных чисел: " + count);
	}

	// task 5
	private static void maxElementOfArray(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Максимальное число массива: " + max);
	}

	private static void minElementOfArray(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Минимальное число массива: " + min);
	}

	// task 6
	private static void minAndMaxElementEvenArray(int[] array) {
		int maxEven = array[0];
		int minEven = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				if (array[i] > maxEven) {
					maxEven = array[i];
				} else if (array[i] < minEven) {
					minEven = array[i];
				}
			}
		}
		System.out.println("Мин. четное: " + minEven + " " + " Макс.четное: " + maxEven);
	}

	private static void minAndMaxElementOddArray(int[] array) {
		int maxOdd = array[0];
		int minOdd = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				if (array[i] > maxOdd) {
					maxOdd = array[i];
				} else if (array[i] < minOdd) {
					minOdd = array[i];
				}
			}
		}
		System.out.println("Мин. нечетное: " + minOdd + " " + " Макс. нечетное: " + maxOdd);
	}

	// task 7
	private static char[] getNameAndSurname() {

		String nameAndSurname = "Shilvian Maksim";
		int sizeArray = nameAndSurname.length();
		char[] name = new char[sizeArray];
		for (int i = 0; i < name.length; i++) {
			name[i] = nameAndSurname.charAt(i);
		}

		return name;
	}

	// task 7.1 Считывание ФИО с клавиатуры
	private static void fullNameKeyboard() {
		System.out.println("Ведите ФИО через пробел: ");
		Scanner scanner = new Scanner(System.in);
		String fullName = scanner.nextLine();
		int sizeArray = fullName.length();
		char[] fio = new char[sizeArray];
		for (int i = 0; i < fio.length; i++) {
			fio[i] = fullName.charAt(i);
		}

		System.out.println("Вы ввели: ");
		for (int i = 0; i < fio.length; i++) {
			System.out.print(fio[i]);
		}
		scanner.close();
	}

	// //task 8
	private static void addPatrToName(char[] firstSecondName) {
		String patr = " Ivanovich";
		int size = patr.length();
		int sizeAdd = firstSecondName.length;
		String fsName = new String(firstSecondName);
		String nameFull = fsName + patr;
		char[] fullName = new char[size + sizeAdd];
		for (int i = 0; i < fullName.length; i++) {
			fullName[i] = nameFull.charAt(i);
		}
		System.out.print("Выше полное имя: ");
		for (int i = 0; i < fullName.length; i++) {
			System.out.print(fullName[i]);
		}
	}

	// //task 9

	private static int[] delElementsDivByThree(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				array[i] = 0;
			}
		}
		int countArray = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				countArray = countArray + 1;
			}
		}
		int[] newArray = new int[array.length - countArray];
		int coutnIter = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] != 0) {
				newArray[coutnIter] = array[j];
				coutnIter++;
			}
		}
		return newArray;
	}

	// сортировка пурызьком

	private static int[] sortingBoubble(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	// //сортировка выбором
	private static int[] sortByChoise(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minel = array[i];
			int min_i = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < minel) {
					minel = array[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				int temp = array[i];
				array[i] = array[min_i];
				array[min_i] = temp;
			}
		}
		return array;
	}

	// сортировка методом вставки
	private static int[] sortByInsert(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				int temp = array[i + 1];
				array[i + 1] = array[i];
				int j = i;
				while (j > 0 && temp < array[j - 1]) {
					array[j] = array[j - 1];
					j--;
				}
				array[j] = temp;
			}
		}
		return array;
	}

	// выбор чисел из массива в заданном диапазоне
	private static void numericalRange(int[] array, int rangeMax, int rangeMin) {
		int maxRange = rangeMax;
		int minRange = rangeMin;
        System.out.println("Вывод чисел из массива в диапазоне " + minRange +  " - " + maxRange + " : ");
		for (int j = 0; j < array.length; j++) {
			for (int i = minRange; i <= maxRange; i++) {
				if (array[j] == i) {
					System.out.println(array[j]);
				}
			}
		}
	}
}
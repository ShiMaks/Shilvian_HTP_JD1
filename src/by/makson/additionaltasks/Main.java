package by.makson.additionaltasks;

public class Main {

	public static void main(String[] args) {

		// Задача 1: Модифицировать пример из учебника следующим образом: цикл for
		// проходит по элементам от 300 до 197
		// и каждый 3 элемент выводит на экран.

		outputOfEch3Elements();

		// Задача 2: Вывести на экран все четные цифры от 1 до 100

		outputEvenNumbers(1, 100);

		// Задача 3: Вывести на экран числа от 10 до -10

		outputFromTo();

		// Задача 4: Создайте программу, вычисляющую факториал натурального числа n.

		int fac = factorial(8);
		System.out.println(fac);

		// Задача 5: Задайте натуральное число. Найдите сумму четных цифр, входящих в
		// его состав.

		int s = parseNumber(445);
		System.out.println(s);

		// Задача 6: Дано число месяца (тип int). Необходимо определить время года
		// (зима, весна, лето, осень) и вывести на консоль.

		timeOfYear(7);

		// Задача 7: Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
		// массива на экран

		int[] array = evenArray();
		printArray(array);

		// Задача 8: Создайте массив из всех нечётных чисел от 1 до 99, выведите его на
		// экран

		int[] ar = oddArray();
		printArray(ar);

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println(" ");
	}

	private static void outputOfEch3Elements() {
		for (int i = 300; i > 197; i = i - 3) {
			System.out.print(i + "\t");
		}
	}

	private static void outputEvenNumbers(int start, int end) {
		for (int i = start; i < end; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
	}

	private static void outputFromTo() {
		for (int i = -10; i > 10; i++) {
			System.out.println(i + "\t");
		}
	}

	private static int factorial(int number) {
		int factorial = 1;
		int i = 1;
		while (i <= number) {
			factorial = factorial * i;
			i++;
		}
		return factorial;
	}

	private static int parseNumber(int number) {
		int summ = 0;
		while (number != 0) {
			if ((number % 10) % 2 == 0) {
				summ = summ + (number % 10);
			}
			number /= 10;
		}
		return summ;
	}

	private static void timeOfYear(int month) {
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
		}
	}

	private static int[] evenArray() {
		int[] array = new int[10];
		int iter = 0;
		for (int i = 2; i <= 20; i = i + 2) {
			array[iter] = i;
			iter++;
		}
		return array;
	}

	private static int[] oddArray() {
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		int[] array = new int[count];
		int iter = 0;
		for (int i = 1; i < array.length; i = i + 2) {
			array[iter] = i;
			iter++;
		}
		return array;
	}

}

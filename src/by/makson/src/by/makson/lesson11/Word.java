package by.makson.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Word {
	
	char[] fole = new char[100];
	private int iter = 0;
	int number = 0;
	
	public void readFile() {
		
	File file = new File("C:\\Users\\HP Book\\Desktop\\Text.txt");
	InputStream stream = null;
	try {
	stream = new FileInputStream(file);
	while((number = stream.read()) != -1) {
			fole[iter] = ((char) number);
			iter++;
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		if(stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	for(int i = 0; i < fole.length; i++) {
		switch (fole[i]) {
			case '+':
				int a = fole[i-1] - '0';
				int b = fole[i+1] - '0';
				System.out.println("Сумма чисел равна:  " + (a + b));
				break;
			case '-':
				int c = fole[i-1] - '0';
				int d = fole[i+1] - '0';
				System.out.println("Разность чисел равна:  " + (c - d));
				break;
			case '*':
				int e = fole[i-1] - '0';
				int f = fole[i+1] - '0';
				System.out.println("Произведение чисел равно:  " + (e * f));
				break;
			case '/':
				int g = fole[i-1] - '0';
				int h = fole[i+1] - '0';
				System.out.println("Результат делания равен:  " + (g / h));
				break;	
		}
	}
	iter = 0;
	}

}


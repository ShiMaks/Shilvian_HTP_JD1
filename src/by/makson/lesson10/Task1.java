package by.makson.lesson10;

import java.util.Random;

public class Task1 {
	

	
	String letter = "Hello world and java !";
	 
	String str = "Array String";
	private int k = 3; 
	private char sym = 'k';
	
	public void getString() {
		char symbol;
		String[] word = letter.split(" ");
		for(String s: word) {
			if(k < s.length()) {
				symbol = s.charAt(k-1);
				s = s.replace(symbol, sym);
				System.out.print(s + " ");
			} else {
				System.out.print(s + " ");
			}
		}
	}
	
	
	public void repeatWord() {
		int count = 0;
		String[] word = letter.split(" ");
		for(int i = 0; i < word.length; i++) {
			String str = word[i];
				for(int j = 0; j < word.length; j++) {
					if(str.equals(word[j])) {
						count++;
					}
			    
			    }
			System.out.println("Слово: " + str + "  встретилось в тексте " + count + "  раз");
			count = 0;
		}
		
	}
	
	public void deleteWord() {
		String letter = "Hello world and java ajava !";
		String[] word = letter.split(" ");
		String[] newWord = new String[word.length];
		String max = " ";
		char [] ch;
		int iter = 0;
		for(String s: word) {
			ch = s.toCharArray();
			if(ch[0] == ch[ch.length - 1] && s.length() > max.length()) {
				max = s;
			}
		}
		System.out.println("Старая строка:  " + letter);
		System.out.println();
		System.out.print("Новая строка:  ");		
		for(int i = 0; i < word.length; i++) {
			if(max.equals(word[i]) == false) {
				System.out.print(word[i] + " ");
			}
		}
		
	}
	
	public void contSymbol() {
		char[] mySymbolArray = new char[100000];
		String s = " ";
		StringBuilder stringBuilder = new StringBuilder(s);
		Random random = new Random();
		for(int i = 0; i < mySymbolArray.length; i++) {
			mySymbolArray[i] = (char)(random.nextInt(26) + 'a');
		}
		long start = System.currentTimeMillis();
		for(int i = 0; i < mySymbolArray.length; i++) {
			s = s + String.valueOf(mySymbolArray[i]);
		}
		long end = System.currentTimeMillis();
		System.out.println("Время выполнения конкатенации String:  " + (end - start));
		System.out.println();
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < mySymbolArray.length; i++) {
			stringBuilder = stringBuilder.append(mySymbolArray[i]);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("Время выполнения конкатенации StringBuilder:  " + (end1 - start1));
		
	}

}

package org.lessons.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		int nomiLength = nomi.length;
		int cognomiLength = cognomi.length;
		
		
		int VALUE_COUNT = 0;
		
		
		if (nomiLength > cognomiLength) {
			
			VALUE_COUNT = nomiLength;
			
		} else if (nomiLength < cognomiLength) {
			
			VALUE_COUNT = cognomiLength;
			
		} else {
			
			VALUE_COUNT = nomiLength;
		}
		
		
		for (int i = 1; i <= VALUE_COUNT; i++) {
			
			int randomIndexName = rnd.nextInt(0, nomiLength);
			
			int randomIndexSurname = rnd.nextInt(0, cognomiLength);
			
			String randomFullName = nomi[randomIndexName] + " " + cognomi[randomIndexSurname];
			
			System.out.println(i + " ---> " + randomFullName);
		}
	}
}

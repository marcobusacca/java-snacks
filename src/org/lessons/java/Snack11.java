package org.lessons.java;

import java.util.Random;

public class Snack11 {

	public static void main(String[] args) {
		
		Random rnd = new Random(1);
		
		int[] numberArray = new int[10];
		
		
		// RIEMPO L'ARRAY CON DEI NUMERI CASUALI COMPRESI TRA 0 E 100
		for (int i = 0; i < numberArray.length; i++) {
			
			numberArray[i] = rnd.nextInt(0, 101);
			System.out.println(i+1 + " ---> " + numberArray[i]);
		}
		
		
		
		// FUNZIONE: STAMPA NUMERO MASSIMO DELL'ARRAY
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < numberArray.length; i++) {
			
			int number = numberArray[i];
			
			if (number > max) {
				
				max = number;
			}
		}
		
		System.out.println("\n--------------------------------"
				+ "\nNumero massimo ---> " + max);
		
		
		
		// FUNZIONE: STAMPA NUMERO MINIMO DELL'ARRAY
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numberArray.length; i++) {
			
			int number = numberArray[i];
			
			if (number < min) {
				
				min = number;
			}
		}
		
		System.out.println("\n--------------------------------"
				+ "\nNumero minimo ---> " + min);
		
		
		
		// FUNZIONE: STAMPA VALORE MEDIO DELL'ARRAY
		
		double avg = 0;
		
		for (int i = 0; i < numberArray.length; i++) {
			
			int number = numberArray[i];
			
			avg += number;
		}
		
		avg /= numberArray.length;
		
		System.out.println("\n--------------------------------"
				+ "\nValore medio ---> " + avg);
	}
}

package org.lessons.java;

import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		String strNum = in.nextLine();
		int strLength = strNum.length();
		
		in.close();
		
		int value = 0;
		
		for (int i = 0; i < strLength; i++) {

			char c = strNum.charAt(i);
			
			int digit = Integer.valueOf(c + "");
			
			value = value * 10 + digit;
		}
		
		System.out.print(value);
	}
}

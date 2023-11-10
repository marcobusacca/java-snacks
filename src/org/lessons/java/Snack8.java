package org.lessons.java;

import java.util.Scanner;

public class Snack8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci una parola: ");
		String input = in.nextLine().toLowerCase();
		int inputLength = input.length();
		
		
		in.close();
		
		
		String output = "";
		
		
		for (int i = 0; i < inputLength; i++) {
			
			char c = input.charAt(i);
			
			if (c == 'a') {
				
				c = 'o';
				
			} else if (c == 'o') {
				
				c = 'a';
			}
			
			output += c;
		}
		
		System.out.println(output);
	}
}

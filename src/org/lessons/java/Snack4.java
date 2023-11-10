package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Dammi una stringa: ");
		String str = in.nextLine();
		int strLength = str.length();
		
		
		in.close();
		
		
		String strReverse = "";
		
		
		for (int i = strLength - 1; i >= 0; i--) {
			
			char c = str.charAt(i);
			
			strReverse += c;
		}
		
		
		if (str.equals(strReverse)) {
			
			System.out.println("Questa parola è Palindroma!");
			
		} else {
			
			System.out.println("Questa parola NON è Palindroma!");
		}
	}
}

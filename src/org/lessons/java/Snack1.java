package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		String strValue = in.nextLine();
		int intValue = Integer.valueOf(strValue);
		
		if (intValue % 2 == 0) {
			
			System.out.println(intValue);
			
		} else {
			
			System.out.println(intValue + 1);
		}
		
		in.close();
	}
}

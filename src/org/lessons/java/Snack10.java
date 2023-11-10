package org.lessons.java;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il numero 1: ");
		String strNum1 = in.nextLine();
		int num1 = Integer.valueOf(strNum1);
		
		System.out.print("Inserisci il numero 2: ");
		String strNum2 = in.nextLine();
		int num2 = Integer.valueOf(strNum2);
		
		in.close();
		
		
		if (num1 > num2) {
			
			int newNum = num2;
			
			num2 = num1;
			
			num1 = newNum;
		}
		
		
		int sum = 0;
		
		for (int i = num1; i <= num2; i++) {
			sum+= i;
		}
		
		System.out.println("La somma dei numeri compresi tra " + num1 + " e " + num2 + " (" + num1 + " e " + num2 + " inclusi), corrisponde a: " + sum);
	}
}

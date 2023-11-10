package org.lessons.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("Inserisci una stringa: ");
			String input = in.nextLine().toLowerCase().replaceAll("\\s", "");
			
			
			if (input.equals("0")) {
                System.out.println("Programma terminato");
                break;
            }
			
			
			int inputLength = input.length();
			
			int characters = 0;
	        int numbers = 0;
	        int symbols = 0;
	        
	        
	        for (int i = 0; i < inputLength; i++) {
	        	
	        	char c = input.charAt(i);
				
	        	if (Character.isLetter(c)) {
	        		
	        		characters++;
	        		
				} else if (Character.isDigit(c)) {
					
					numbers++;
					
				} else {
					
					symbols++;
				}
			}
	        
	        System.out.println("Caratteri: " + characters);
			System.out.println("Numeri: " + numbers);
			System.out.println("Simboli: " + symbols + "\n");
		}
	}
}

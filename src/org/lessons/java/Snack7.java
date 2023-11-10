package org.lessons.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci i secondi: ");
		String strSecondi = in.nextLine();
		int secondi = Integer.valueOf(strSecondi);
		
		in.close();
		
		int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        int restantiSecondi = secondi % 60;

        String risultato = String.format("%02d:%02d:%02d", ore, minuti, restantiSecondi);
        
        System.out.println(risultato);
	}
}

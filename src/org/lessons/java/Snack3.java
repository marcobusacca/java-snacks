package org.lessons.java;

public class Snack3 {

	public static void main(String[] args) {
		
		int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i = 1; i < numberArray.length; i+=2) {
				
			sum+= numberArray[i];
				
			System.out.println(i + " ---> " + numberArray[i]);
		}
		
		System.out.println("Somma: " + sum);
	}
}

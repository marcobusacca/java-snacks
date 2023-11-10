package org.lessons.java;

public class Snack9 {

	public static void main(String[] args) {
		
		int[] numberArray = {1, 2, 3, 4, 5};
		
		int evenArrayLength = 0;
		int oddArrayLength = 0;
		
		
		for (int i = 0; i < numberArray.length; i++) {
			
			int number = numberArray[i];
			
			if (number % 2 == 0) {
				
				evenArrayLength++;
			} else {
				
				oddArrayLength++;
			}
		}
		
		
		int[] evenArray = new int[evenArrayLength];
		
		int[] oddArray = new int[oddArrayLength];
		
		int evenArrayIndex = 0;
		int oddArrayIndex = 0;
		
		
		for (int i = 0; i < numberArray.length; i++) {
			
			int number = numberArray[i];
			
			if (number % 2 == 0) {
				
				evenArray[evenArrayIndex] = number;
				evenArrayIndex++;
				
			} else {
				
				oddArray[oddArrayIndex] = number;
				oddArrayIndex++;
			}
		}
		
		
		System.out.println("Array con numeri pari ---> lunghezza = " + evenArrayLength);
		
		for (int i = 0; i < evenArray.length; i++) {
			
			System.out.println(evenArray[i]);
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("Array con numeri dispari ---> lunghezza = " + oddArrayLength);
		
		for (int i = 0; i < oddArray.length; i++) {
			
			System.out.println(oddArray[i]);
		}
	}
}

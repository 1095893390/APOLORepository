package com.ocajexam.exercises;


public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TEST 6) 26% EBOOK
		long p = 17496;
		Double primeSquareRoot = Math.sqrt(p);
		boolean isPrime = true;
		for (long j = 2; j <= primeSquareRoot.longValue(); j++) {
			if (p % j == 0) {
				// Print divisors
				System.out.println(j + "x" + p / j);
				isPrime = false;
			}
		}
		System.out.println("Prime number: " + isPrime);
		
		// TEST 9) 27% EBOOK
		System.out.println(3 + 3 + "3");
		System.out.println();
		System.out.println("3" + 3 + 3);


	}

}

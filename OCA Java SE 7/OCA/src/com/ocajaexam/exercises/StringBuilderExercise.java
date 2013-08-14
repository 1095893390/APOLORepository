package com.ocajaexam.exercises;


public class StringBuilderExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// S  h  i  v  e  r     M  e     T  i  m  b  e  r  s  !
		// 0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17
		
		StringBuilder mateyMessage = new StringBuilder("Shiver Me Timbers!");
		
		// Appends the supplied character sequence to the string.
		System.out.println(mateyMessage.append(" Bad Storm!"));
		
		StringBuilder e = new StringBuilder("Examples:");
		e.append(" ").append("1"); 					 	// String
		e.append(" ").append(new StringBuffer("2"));
		e.append(" ").append('\u0031'); 				// char
		e.append(" ").append((int)2); 					// int
		e.append(" ").append(1L); 						// long
		e.append(" ").append(2F);						// float	
		e.append(" ").append(1D);						// double
		e.append(" ").append(true);						// boolean
		
		// Prints out "Examples: 1 2 1 2 1 2.0 1.0 true"
		System.out.println(e);
		
		/////////////////////////////////
		///// Insert Method
		////////////////////////////////
		
		StringBuilder mateyMessage2 = new StringBuilder("Shiver Me Tim");		
		mateyMessage2.insert(13, " and Bricks");
		System.out.println(mateyMessage2);
		
		
		/////////////////////////////////
		///// Delete Method
		////////////////////////////////
		
		System.out.println(mateyMessage.delete(19, 29));
		
		/////////////////////////////////
		///// Delete Char At Method
		////////////////////////////////
		
		System.out.println(mateyMessage.deleteCharAt(17));
		
		/////////////////////////////////
		///// Reverse Method
		////////////////////////////////
		
		StringBuilder builder = new StringBuilder("live");
		builder.reverse();
		System.out.println(builder.toString().toUpperCase() + "!");
		
		

	}

}

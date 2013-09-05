package com.ocajexam.exercises.cap6;

import java.util.ArrayList;

public class ArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// example of multi-dimensional arrays 
		int[][] square = new int[3][3];
		for (int i=0; i<3; i++) {
			square[i][i] = 5;
		}
		int sum=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += square[i][j];
			}
		}
		
		System.out.println(sum);
		
		// example of arrays
		
		int[][] square2 = new int[2][];
		square2[0] = new int[5];
		square2[1] = new int[3];
		
System.out.println(square2);		
		
		// array list example
		ArrayList<String> sampleArrayList = new ArrayList<String>();
		sampleArrayList.add("One");
		sampleArrayList.add("Two");
		sampleArrayList.add(1, "Three");
		for(String s : sampleArrayList) {
			System.out.println(s + " ");
		}
		
	}

}

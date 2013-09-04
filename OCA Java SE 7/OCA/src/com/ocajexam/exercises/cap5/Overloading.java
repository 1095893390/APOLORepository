package com.ocajexam.exercises.cap5;

public class Overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		LogManager logManager = new LogManager();
		logManager.logInfo("First log message", -299);
		logManager.logInfo("Second log message");
		
		int value = 1;
		System.out.println("Argument: value = " + value);	    
		TestOverloading.addTwo(value);
		System.out.println("After method call: value = " + value);
		
		Number valueNumber = new Number(1);
		System.out.println("Argument: value = " + valueNumber.getNumber());	    
		TestOverloading.addThree(valueNumber);
		System.out.println("After method call: value = " + valueNumber.getNumber());

	}
	
	

}

class LogManager {
	
	public void logInfo(String message, int errorNumber) {
		System.out.println("Error: " + errorNumber + " | " + message);
	}
	
	public void logInfo(String message) {
		logInfo(message, -1);
	}
	
}

class TestOverloading {
	public static void addTwo(int value) {
		System.out.println("Parameter: value = " + value);
		value = value + 2;
		System.out.println("Leaving method: value = " + value);
	}
	
	public static void addThree(Number value) {
		System.out.println("Parameter: value = " + value.getNumber());
		value.setNumber(value.getNumber() + 3);
		System.out.println("Leaving method: value = " + value.getNumber());
	}
}

class Number {
	
	int number;
	
	public Number (int number) {
		this.number = number;
	}
	
	int getNumber() {
		return this.number;
	}
	
	void setNumber(int number) {
		this.number = number;
	}
	
}




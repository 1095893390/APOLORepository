package com.ocajexam.exercises;

import java.util.Properties;


public class PropertiesManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println(System.getenv());
		
		
		
		if (args.length == 0) System.exit(0);
		
		Properties props = System.getProperties();
		
		System.out.println(props.getProperty("java.library.path"));
		
		/* New property example */
		
		props.setProperty("-list_prop", "new_value2");
		
		switch (args[0]) {
		
			case "-list_all" :
				props.list(System.out); // Lists all properties
				break;
				
			case "-list_prop":
				/* Lists value */
				System.out.println(props.getProperty(args[0]));
				break;
			
			default:
				System.out.println("Usage: java PropertiesManager [-list_all]");
				System.out.println("          java PropertiesManager [-list_prop [property]]");
				break;
		}

	}

}

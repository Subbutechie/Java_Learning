package com.designPatterns.Singleton;

public class Logger {
	
	// Here I am going to implement Singleton pattern on class with name Logger so that only one instance
	// of the logger class is created.
	
	private static volatile Logger instance;
	
	//This prevents other classes in creating new instances(objects) of the Logger Class
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		if(instance == null) {
			synchronized (Logger.class) {
				if(instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
		
	}
	
	public void log(String message) {
		System.out.println("Log: "+ message);
	}
}

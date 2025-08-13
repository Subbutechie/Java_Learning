package com.designPatterns.Singleton;

import java.util.Locale;

public class ClassUsingSingleton {
	
	//Here this class is going to use the instance which is only one provided by the Logger class
	//to log messages
	
	
	public static void main(String[] args) {
		//Even though we are calling two instances of logger class only one is created but called multiple times
		//This ensures efficient use of resources
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		
		System.out.println(logger1.getClass());
		System.out.println(logger1.hashCode());
		//Here I am going to check whether all the instances are pointing to the same
		if(logger1 == logger2) {
			System.out.println("Yes, both the objects are using the same instance");
		}else {
			System.out.println("NO, both the objects are using the different instance");
		}
		
		logger1.log("app started..");
		logger2.log("Doing some ops...");
		
	}
	
	

}

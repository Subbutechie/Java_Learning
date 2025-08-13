package com.designPatterns.Singleton;

class LoggerThread extends Thread{
	@Override
	public void run() {
		LoggerUsingMultiThread logger = LoggerUsingMultiThread.getInstance();
		logger.log("Logging message from - "+Thread.currentThread().getName());
	}
}
public class ClassUsingLoggerMulti {
	
	public static void main(String[] args) {
		for(int i =0 ; i<5; i++) {
			new LoggerThread().start();
		}
	}
}

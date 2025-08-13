package com.designPatterns.Singleton;

public class LoggerUsingMultiThread {

	private static volatile LoggerUsingMultiThread instance;

	private LoggerUsingMultiThread() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static LoggerUsingMultiThread getInstance() {
		if (instance == null) {
			synchronized (LoggerUsingMultiThread.class) {
				// Double check (inside synchronized block)
				if (instance == null) {
					instance = new LoggerUsingMultiThread();
				}
			}
		}
		return instance;
	}

	public void log(String message) {
		System.out.println(
				Thread.currentThread().getName() + " - " + message + "| Instance Id: " + System.identityHashCode(this));
	}

}

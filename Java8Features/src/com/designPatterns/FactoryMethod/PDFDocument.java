package com.designPatterns.FactoryMethod;

public class PDFDocument implements Document {

	@Override
	public void open() {
		System.out.println("Opening PDF Document");
		
	}

}

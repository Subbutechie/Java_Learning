package com.designPatterns.FactoryMethod;

public class ExcelDocument implements Document{

	@Override
	public void open() {
		System.out.println("Opening excel document......");
	}

}

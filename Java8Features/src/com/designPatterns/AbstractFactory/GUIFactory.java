package com.designPatterns.AbstractFactory;

public interface GUIFactory {
	//This is the abstract factory
	Button createButton();
	
	Checkbox createChechbox();

}

package com.designPatterns.AbstractFactory;

public class ConcreteFactories {
	
	class WindowsFactory implements GUIFactory{

		@Override
		public Button createButton() {
			return 	new ConcreteProducts().new WindowsButton();
		}

		@Override
		public Checkbox createChechbox() {
			return null;
		}
		
	}

}

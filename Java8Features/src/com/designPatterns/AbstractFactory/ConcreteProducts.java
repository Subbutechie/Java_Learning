package com.designPatterns.AbstractFactory;

public class ConcreteProducts {
	
	public  class WindowsButton implements Button{

		@Override
		public void render() {
			System.out.println("Rendering windows button");
		}
	
	}
	
	public class WindowsCheckbox implements Checkbox{

		@Override
		public void render() {
			System.out.println("Rendering windows checkbox");
		}
		
	}
	
	class MacButton implements Button{

		@Override
		public void render() {
			System.out.println("Rendering Mac Button");
		}
		
	}
	
	class MacCheckbox implements Checkbox{

		@Override
		public void render() {
			System.out.println("Rendering Mac CheckBox");
			
		}
		
	}

	

}

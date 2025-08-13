package com.testData;

public class CloneExample {
	//The object class has a clone() method which clones an object and it throws an cloneNotSupported Exception
	//if not handled
	//To handle that class has to implement the cloneable interface
	public static void main(String[] args) throws CloneNotSupportedException {
		
			Person p1 = new Person("Subbu", 25);
			Person p2 = (Person) p1.clone();
			
			p1.display();
			p2.display();		 
	}
	
	

}

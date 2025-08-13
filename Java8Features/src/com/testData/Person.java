package com.testData;

public class Person extends Object implements Cloneable {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	 @Override 
	 public Object clone() throws CloneNotSupportedException { 
		 return super.clone();
	 }
	 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void display() {
		System.out.println("Name: " + name + "Age: " + age);

	}

}

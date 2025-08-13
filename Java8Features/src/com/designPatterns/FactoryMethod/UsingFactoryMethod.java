package com.designPatterns.FactoryMethod;

public class UsingFactoryMethod {
	
	public static void main(String[] args) {
		Document doc1 = DocumentFactory.createDocument("pdf");
		doc1.open();
		
		Document doc2 = DocumentFactory.createDocument("word");
		doc2.open();
		
		Document doc3 = DocumentFactory.createDocument("pwp");
		doc3.open();
	}
	

}

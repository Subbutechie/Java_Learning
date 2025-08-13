package com;

public class Interview {
	
	public void add(int a) {
		System.out.println("sum:" + a);
	}
	
	public void add(int a, int b) {
		System.out.println("sum: "+a+b);
	}
	
	public static void main(String[] args) {
	
		Interview i = new Interview();
		i.add(2);
		i.add(1,3);
		
		Interview a = new interview1();
		a.add(5,1);
		
	}
	
}

class interview1 extends Interview{
	
	@Override
	public void add( int a, int b) {
		System.out.println("sub: " + (a-b));
	}
	
	
}


package com;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println(digitsum(1234));
	}

	private static int digitsum(int i) {
		
		
		
		if(i==0) return 0;
		
		return i%10+digitsum(i/10);
	}

}

package com;

public class sumOfNaturalNum {

	public static void main(String[] args) {

		int n = 5;
		System.out.println(sumOfN(n));
	}

	private static int sumOfN(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumOfN(n-1);
		
	}

}

package com;

public class FibonacciUsingRecursion {
	public static void main(String[] args) {
		Fibo(10);
	}

	private static void Fibo(int n) {
		
		for(int i =0; i<n; i++) {
			System.out.println(helper(i));
		}
	}

	private static int  helper(int n) {
		//base condition
		if(n <= 1) {
			return n;
		}
		
		return helper(n-1)+helper(n-2);
	}

}

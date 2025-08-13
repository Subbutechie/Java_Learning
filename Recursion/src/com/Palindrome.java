package com;

public class Palindrome {

	public static void main(String[] args) {
		boolean res = palin(12321)? true:false;
		System.out.println(res);
		
	}

	private static boolean palin(int n) {
		return n == rev(n,0);
	}

	private static int rev(int n, int reverse) {
		
		//base condition
		if(n %10 == 0) return reverse;
		
	
		reverse = reverse*10+n%10;
		return rev(n/10,reverse);
	}
	
	

}

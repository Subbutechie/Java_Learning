package com;

public class ReverseNum {

	public static void main(String[] args) {
		
		System.out.println(rev(12321,0));
		System.out.println(reverse(12345));
		
	}
	
	static int rev(int n,int reverse) {
		
		
		 reverse = reverse * 10+ n%10;
		//base condition
			if(n %10 == n) return reverse;
				
		
		return rev(n/10,reverse);
	}
	
	
	//To reverse rem * 10 ^ digits-1+fun(n/10,digits-1)
	
	static int reverse(int n) {
		//Gives the number of digits in the number
		int digits = (int)Math.log10(n)+1;
		return helper(n, digits);
	}

	private static int helper(int n, int digits) {
		//base condition
		if(n%10 == n) {
			return n;
		}
		int rem  = n%10;
		return (int) (rem*Math.pow(10, digits-1)+helper(n/10,digits-1));
	}

}

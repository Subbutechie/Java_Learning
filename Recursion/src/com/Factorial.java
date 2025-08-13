package com;

public class Factorial {
	
	public static int factorialTailRecursive(int n, int accumulator) {
        if (n == 0) {
            return accumulator;
        } else {
            return factorialTailRecursive(n - 1, accumulator * n);
        }
    }
	
	 public static int factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }

    public static void main(String[] args) {
       // System.out.println(factorialTailRecursive(5, 1));  // Output: 120
        System.out.println(factorial(5));
    }

}

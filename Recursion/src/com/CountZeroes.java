package com;

public class CountZeroes {

	public static void main(String[] args) {

		System.out.println(numOfZeroes(10400202));
		System.out.println(countZeroes(10034830));
	}

//-------------------------------------------------------
	private static int numOfZeroes(int n) {

		// counting the number of digits to know how many times to run the recursion
		int digits = (int) Math.log10(n) + 1;

		return helper(n, digits);
	}

	static int count = 0;

	private static int helper(int n, int digits) {

		// base condition
		// when all the numbers are checked return the number of zeroes till then
		if (digits == 0)
			return count;

		// Using a count variable to count number of zeroes
		if (n % 10 == 0)
			count++;

		return helper(n / 10, digits - 1);
	}
//-----------------------------------------------------------

	// another way
	// call the recursive function when the number is zero and increase the count
	// If it's not zero call the function without increasing the zero

	static int countZeroes(int n) {
		return helper1(n, 0);
	}

	private static int helper1(int n, int count) {
		//base condition
		if(n == 0) return count;
		
		if(n%10 == 0) {
			return helper1(n/10,count+1);
		}
		
		return helper1(n/10, count);
	}
}

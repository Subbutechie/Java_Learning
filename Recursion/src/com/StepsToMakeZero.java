package com;

public class StepsToMakeZero {

	public static void main(String[] args) {
		System.out.println(numOfSteps(14));
	}

	private static int numOfSteps(int n) {
		return helper(n,0);
	}

	private static int helper(int n, int steps) {
		//base condition
		if(n ==0) return steps;
		
		if(n%2 == 0) {
			return helper(n/2, ++steps);
		}
		return helper(n-1, ++steps);
	}

}

package com;

import java.util.HashMap;

public class MemoizedFibonacci {
	
	public static void main(String[] args) {
		int N = 10;
		for (int i = 0; i < N; i++) {
			System.out.println(Fibonacci(i)+" ");
		}
		
	}
	
	public static int Fibonacci(int n) {
		//base condition
		
		//This reduces the number of function calls, improving performance significantly
		HashMap<Integer, Integer> memo = new  HashMap<Integer, Integer>();
		if(n==0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		
		int res = Fibonacci(n-1)+Fibonacci(n-2);
		memo.put(n, res);
		return res;
	}

}

package com;

public class ArraySortedOrNot {
	public static void main(String[] args) {
		int[] arr = {1,2,4,8,9,12};
		System.out.println(isSorted(arr,0));
	}

	

	private static boolean isSorted(int[] arr, int i) {
		//base condition
		if(i == arr.length-1) return true;
		
		/*
		 * if(arr[i+1]>arr[i]) return helper(arr,i+1); return false;
		 */
		
		return arr[i]<arr[i+1] && isSorted(arr, i+1);
	}

}

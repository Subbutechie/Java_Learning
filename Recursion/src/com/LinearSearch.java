package com;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,4,8,9,12};
		int target = 2 ;
		//System.out.println(linearSearch(arr,target,0));
		System.out.println(findIndex(arr,target,0));
	}
	
	
	static boolean linearSearch(int [] arr, int target, int index) {
		
		//base condition
		if(index == arr.length)
			return false;
		
		return  arr[index] == target||linearSearch(arr, target, index+1);
	}
	
	
	static int  findIndex(int[] arr, int target, int index) {
		//base condition
		if(index == arr.length) {
			return -1;
		}
		
		if(arr[index] == target) 
			return index;
		
		return findIndex(arr, target, index+1);
	}
}

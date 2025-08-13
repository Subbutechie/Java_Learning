package com;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,7,8,9}; 
		int n= arr.length;
		boolean  res = binary(arr,0,n-1,1);
		if(res) System.out.println("found");
		else {
			System.out.println("not found");
		}
	}

	private static boolean  binary(int[] arr,int start, int end,int target) {
		
		int mid = start +(end-start)/2;
		if(start>end) {
			return false;
		}
		if(arr[mid] == target) {
			return true;
			
		}
		
		if(arr[mid]>target) {
			return binary(arr,start,mid-1,target);
		}
		return binary(arr,mid+1,end,target);
		
	}

}

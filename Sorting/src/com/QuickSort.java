package com;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4};
		int low = 0;
		int high = arr.length-1;
		quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void quickSort(int[] arr, int low, int high) {
		
		//this enables low and start are same for every recursion
		int s = low;
		int e = high;
		//here I am choosing the middle element as pivot
		int pivot = s+(e-s)/2;
		
		//base condition
		if(low>=high) return; 
		
		while(s<=e) {
			
			while(arr[s]<arr[pivot]) {
				s++;
			}
			while(arr[e]>arr[pivot]) {
				e--;
			}
			
			//when the both above conditions fail and  if s<=e and swap
			if(s<=e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
			
		}
		
		//BY now the pivot element will be moves to the corect position
		//Now call recursion on the remaining part of the array
		quickSort(arr, low, e);
		quickSort(arr, s, high);
		
	}

}

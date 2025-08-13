package com;

import java.util.Arrays;

public class MergesortInPlace {

	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4};
		int start = 0;
		int end = arr.length;
		mergeSort(arr, start, end);
		System.out.println(Arrays.toString(arr));
		
	}
	static void mergeSort(int[]arr,int s, int e) {
		
		//base condition
		if(e-s <= 1) return;
		
		int mid = s+(e-s)/2;
		
		mergeSort(arr, s, mid);
		mergeSort(arr, mid, e);
		
		 merge(arr,s,mid,e);
		
		
	}
	
	static void merge(int[] arr,int s, int mid,int e) {
		int i = s;
		int j = mid;
		int k =0;
		int[] sorted = new int[e-s];
		
		while(i<mid && j<e) {
			if(arr[i]<arr[j]) {
				sorted[k] = arr[i];
				i++;
			}
			else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i<mid) {
			sorted[k] = arr[i];
			i++;
			k++;
		}
		
		while(j<e) {
			sorted[k] = arr[j];
			j++;
			k++;
		}
		
		for(int l =0; l<sorted.length;l++) {
			arr[s+l] = sorted[l];
		}
			
	}

}

package com;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		
		
		int[] ans = Mergesort(new int[] {0 ,1, 2 ,0, 1, 2});
		System.out.println(Arrays.toString(ans));
	}

	private static int[] Mergesort(int[] arr) {
		
		//base condition
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int[] left = Mergesort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = Mergesort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
	}

	private static int[] merge(int[] first, int[] second) {
		//Here we merge the sort the arrays and merge them at the same time
		
		int i =0;
		int j = 0;
		int  k=0;
		int[] sorted = new int[first.length+second.length];
		
		while(i<first.length && j< second.length) {
			
			if(first[i]<second[j]) {
				sorted[k] = first[i];
				i++;
			}else {
				sorted[k] = second[j];
				j++;
			}
			k++;
		}
		
		//In case after the above the operation ,any elements are left in the first or second array
		// we just place them at the end of the sorted array.Since the arrays are already sorted they
		//that means the remaining elements are already greater than the elements already placed 
		// in the array
		//{3,5} & {1,2,4}
		//In this case 5 element will be left from the first while loop because j reaches it's limit
		// that is j<second.length
		//Then we place 5 at the end of the sorted array
		
		
		while(i<first.length) {
			sorted[k] = first[i];
			i++;
			k++;
		}
		
		//if elements are left in the second array
		
		while(j<second.length) {
			sorted[k] = second[j];
			j++;
			k++;
		}
		return sorted;
	}

}

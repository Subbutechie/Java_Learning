package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayReversal {
	
	
	public static void main(String[] args) {
		
		int[] arr = {23, 4,5,56,23};
		int n = arr.length;
		
		
		
		
//		 int[] result = (reverseRecursion(arr,0,n-1));
//		 for(int i: result) {
//		  System.out.println(i);
//		  }
//		 
//		int[] res = reverseUsingCollections(arr,n);
//		 for(int i: res) {
//			  System.out.print(i+" , ");
//			  }
		System.out.println(Arrays.toString(arr));
		 reverseUsingStreams(arr);
		
	}
	
	//Using another array
	//TC: O(n)
	//SC: O(n)
	private static int[] reverse(int[] arr, int n) {
		
		int[] aux = new int[n];
		int i;
		for(i=n-1; i>=0; i--) {
			
				aux[n-1-i] = arr[i];
			
		}
		return aux;
	}
	
	//using two pointers and swap
	//TC: O(n)
	//SC: O(1)
	static int[] arrayReverse(int[] arr, int n) {
		int start=0, end=n-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	
	
	//using Recursion
	//TC: O(n)
	//SC: O(1)
	static int[] reverseRecursion(int[] arr,int start, int end)  {
		if(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseRecursion(arr,start+1,end-1);
		}
		
		return arr;
		
	}
	
	//Using Library function
	
	static int[] reverseUsingCollections(int[] arr, int n) {
		
		
		Collections.reverse(Arrays.asList(arr));
		return arr;
	}
	
	//sorting and reversing the array using streams
	static void sortreverseUsingStreams(int[] arr) {
		int[] reversedArray = Arrays.stream(arr).boxed().
											sorted(Collections.reverseOrder()).
											mapToInt(Integer::intValue).
											toArray();
		
		System.out.println(Arrays.toString(reversedArray));
	}

	//reverse without sorting
	int[] numbers = {1, 2, 3, 4, 5};
int[] reversed = Arrays.stream(numbers)
                       .boxed()
                       .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                           Collections.reverse(list);
                           return list.stream();
                       }))
                       .mapToInt(Integer::intValue)
                       .toArray();
System.out.println(Arrays.toString(reversed));
	
	//Reversing the array using streams
	static void reverseUsingStreams(int[] arr) {
		int[] res = IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 -i]).toArray();
		System.out.println(Arrays.toString(res));
	}

}

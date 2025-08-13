package easyKunal;

import java.util.Arrays;

public class RecursiveBubbleSort {
	public static void main(String[] args) {
		int[] arr = {2,3,1,5,4};
		int n =arr.length;
		System.out.println(Arrays.toString(arr));
		
		bubble(arr,n);
		System.out.println(Arrays.toString(arr));
	}

	 static void bubble(int[] arr,int n) {
		 boolean swapped = false;
		
		
		
		//swap
		for(int i = 0; i<n-1;i++) {
			int temp = 0;
			if(arr[i]>arr[i+1]) {
				//swap
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				swapped = true;
				
			}
		}
		
		//base condition
		//even one swap is missed break the loop
				if(!swapped) return ;
				
				
		 bubble(arr,n-1);
		 
	}

}

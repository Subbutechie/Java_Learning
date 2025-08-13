package easyKunal;

import java.util.Arrays;

public class PrintSumTriangle {

	public static void main(String[] args) {
		
		int[] arr = {1,4,7,8,9};
		printTraingle(arr);
	}

	private static void printTraingle(int[] arr) {
		
		//base condition
		if(arr.length<1) {
			return;
		}
		
		//The new array is one element less
		int[] temp = new int[arr.length-1];
		for(int i = 0; i<arr.length-1; i++) {
			int x = arr[i]+ arr[i+1];
			temp[i] = x;
		}
		
		//System.out.println(Arrays.toString(arr));
		printTraingle(temp);
		
		
		
		//When the function call are moved out of the stack after reaching the base condition
		//they will return the value and it will be printed at the same time
		System.out.println(Arrays.toString(arr));
		
		
	}

}

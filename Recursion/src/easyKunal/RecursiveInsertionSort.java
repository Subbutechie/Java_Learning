package easyKunal;

import java.util.Arrays;

public class RecursiveInsertionSort {

	public static void main(String[] args) {

		int[] arr = {2,4,3,1,5};
		insertion(arr,0);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertion(int[] arr,int i) {
		int n = arr.length;
		//base condition
		if(i == n-1) return ;
		
		for(int j = i+1; j>0; j--) {
			if(arr[j] < arr[j-1]) {
				//swap
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
			else {
				break;
			}
		}
		
		insertion(arr, i+1);
	}

}

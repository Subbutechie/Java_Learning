package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int [] arr = {1,3,4,0,4};
		
		System.out.println(func(arr).toString());
		
	}

	//TC:O(N*3)
	private static List<Integer> func(int[] arr) {
		int n  = arr.length;
		
		for(int i =0; i<n-2; i++) {
			
			for(int j = i+1; j<n-1;j++) {
				
				int sum1 = findSum(arr,0,i);
				int sum2 = findSum(arr,i+1,j);
				int sum3 = findSum(arr,j+1,n-1);
				
				
				if(sum1 == sum2 && sum2 == sum3) {
					return new ArrayList<Integer>(Arrays.asList(i,j));
				}
			}
			
		}
		return new ArrayList<Integer>(Arrays.asList(-1,-1));
	}

	private static int findSum(int[] arr, int start, int end) {
		int sum = 0;
		for(int i =start; i<=end; i++) {
			sum += arr[i];
		}
		return sum;
	}

}

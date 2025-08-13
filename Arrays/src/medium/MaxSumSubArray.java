package medium;

import java.util.Arrays;

public class MaxSumSubArray {
	
	public static void main(String[] args) {
		int[] arr = maxSubArray(new int[] {});
		System.out.println(Arrays.toString(arr));
	}

	private static int[] maxSubArray(int[] arr) {
		
		
		if(arr.length == 0|| arr == null) {
			return new int[0];
		}
		int start =0 ;
		int end = 0; //variables to store the range of subarray
		int tempStart = 0;
		int currentMax = arr[0];
		int maxSoFar = arr[0];
		
		
		
		for(int i =1; i<arr.length; i++) {
			if(arr[i] > currentMax+arr[i]) {
				currentMax = arr[i];
				tempStart = i;
			}
			else {
				currentMax = currentMax+arr[i];
			}
			
			if(currentMax > maxSoFar) {
				maxSoFar = currentMax;
				start = tempStart;
				end = i;
			}
			
		}
		
		//Extracting the subarray
		int[] res = new int[end-start+1];
		for(int i = 0; i<res.length; i++) {
			res[i] = arr[start+i];
		}
		
		return res;
	}
	

}

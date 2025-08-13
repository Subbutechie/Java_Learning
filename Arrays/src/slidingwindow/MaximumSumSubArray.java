package slidingwindow;

public class MaximumSumSubArray {
	public static void main(String[] args) {
		int[] arr = {3,5,1,6,7,5,10};
		//Here k is the size of the subarray size 
		int k = 3;
		System.out.println("Using Brute Force: "+maxSumSubArrayBruteForce(arr,k));
		System.out.println("Using sliding window: "+maxSumSubArray(arr,k));
	}

	public static int maxSumSubArrayBruteForce(int[] arr,int k) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<=arr.length-k; i++) {
			int sum = 0;
			for(int j = i; j<i+k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
	
	public static int maxSumSubArray(int[] arr, int k) {
		
		int windowSum =0;
		int maxSum = Integer.MIN_VALUE;
		//First window sum
		for(int i = 0; i<k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;
		
		//now slide the window by one element
		for(int i = k; i<arr.length;i++) {
			windowSum += arr[i] - arr[i-k];
			maxSum = Math.max(maxSum,windowSum);
		}
		
		return maxSum;
	}

}

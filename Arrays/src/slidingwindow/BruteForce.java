package slidingwindow;

public class BruteForce {
	
// Here I am trying to find the longest subarray whose sum<=14
	public static void main(String[] args) {
		
		int[] arr = {2,5,1,7,10};
		int n = arr.length;
		int maxLen = 0;
		int maxValue = 0;
		
		for(int i =0; i<n; i++) {
			int sum = 0;
			for(int j =i; j<n ;j++) {
				sum += arr[j];
				
				if(sum<=14) {
					maxLen = Math.max(maxLen, j-i+1);
					maxValue = Math.max(maxValue,sum);
				}
			}
		}
		System.out.println(maxLen);
		System.out.println(maxValue);
	}

}

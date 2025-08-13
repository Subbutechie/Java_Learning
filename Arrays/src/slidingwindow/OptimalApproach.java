package slidingwindow;

public class OptimalApproach {
// Here I am trying to find the longest sub-array whose sum<=10
	public static void main(String[] args) {
		int[] arr = {2,3,5,8,7,4}; 
		int k =10;
		
		fun(arr,k);
		
	}

	private static void fun(int[] arr, int k) {
		
		int l=0,r =0 ;
		int sum = 0;
		int maxLen = 0;
		int n = arr.length;
		while(r<n) {
			sum = sum+arr[r];
			
			//shrinking condition
			while(sum>k) {
				sum = sum - arr[l];
				l++;
			}
			maxLen = Math.max(maxLen, r-l+1);
			r++;
		}
		
		System.out.println(maxLen);
	}

}

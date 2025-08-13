package medium;

public class agf {

	public static void main(String[] args) {
		int arr[] = {1, 0, 0, 1, 0, 1, 0, 1};
		int k =2;
		maxOnes(arr,k);
		
		
	}
	public static void maxOnes(int arr[], int k) {
		//sliding window
		int n =arr.length;
		int l = 0;
		int r = 0;
		int max = 0;
		int count =0;//To count the number of zeroes in the window
		
		
		
		while(r<n) {
			
			//If the current window has zeroes we count them
			
				if(arr[r] == 0) count++;
			
			//If the number of the zeroes in the current window exceeds k we shrink
			// the window by moving the left pointer	
			while(count>k) {
				if(arr[l] == 0) {
					count--;
				}
				l++;
			}
		
			// Update the maximum length of the window with at most k flips
			max = Math.max(max, r-l+1);
			
			//Expand the window by increasing the right pointer
			r++;
			
			
		}
		System.out.println(max);
		
		
	}
        
        
         
	
}

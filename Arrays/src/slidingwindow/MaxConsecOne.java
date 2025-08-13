package slidingwindow;

public class MaxConsecOne {
	
	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1} ;
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	 static int findMaxConsecutiveOnes(int[] nums) {

	        int l=0;
	        int r =0;
	        int maxLen = 0;
	        int n = nums.length;
	        
	        while(r<n){
	            
	           
	            while(l<r && nums[r] == 0) {
	            	l++;
	            }
	            maxLen = Math.max(maxLen, r-l+1);
	            r++;
	        }
	        return maxLen;
	        
	    }
}

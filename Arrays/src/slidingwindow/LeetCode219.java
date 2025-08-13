package slidingwindow;

import java.util.HashSet;

public class LeetCode219 {
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums,k));
		
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		if(nums.length ==0 || nums.length ==1) {
			return false;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int  i =0; i< nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			else {
				set.add(nums[i]);
			}
			
			if(set.size() > k){
				set.remove(nums[i-k]);
			}
			
		}
		
		return false;
        
    }

}

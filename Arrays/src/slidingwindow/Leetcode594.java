package slidingwindow;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode594 {
	public static void main(String[] args) {
		System.out.println(findLHS(new int[] {1,3,2,2,5,2,3,7}));
		System.out.println(findLHSUsingMap(new int[] {1,3,2,2,5,2,3,7}));
	}
	
	//TC : O(NlogN)
	//SC: O(N)
	public static int findLHS(int[] nums) {
		int left = 0, right = 1;
		int result= 0;
		
		Arrays.sort(nums);
		for(int i = 0; i<nums.length; i++) {
			int diff = nums[right] - nums[left];
			
			if(diff == 1) {
				result = Math.max(result, right-left+1);
			}
			
			if(diff<=1) {
				right++;
			}else {
				left++;
			}
		}
		return result;

    }
	
	//TC: O(N)
	//SC: O(N)
	public static int findLHSUsingMap(int[] nums) {
		HashMap<Integer,Integer> mp  = new HashMap<Integer,Integer>();
		int result = 0;
		
		for(int i = 0; i<nums.length; i++) {
			mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
		}
		
		mp.forEach((key,value) -> System.out.println(key+"->"+value));
		
		for(int i : mp.keySet()) {
			if(mp.containsKey(i+1)) {
				result = Math.max(mp.get(i)+mp.get(i+1), result);
			}
		}
		
		return result;
	}



}

package easy;

import java.util.Arrays;

public class LeetCode_350 {
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i =0, j=0, k=0;
	        int[] res = new int[nums1.length];
	        while(i<nums1.length && j<nums2.length){
	            if(nums1[i] == nums2[j]){
	                res[k++] = nums1[i];
	                
	                
	                i++;
		            j++;
	            }
	            else if(nums1[i]>nums2[j]) {
	            	j++;
	            }
	            else {
	            	i++;
	            }

	        }

	        return Arrays.copyOf(res,k);
	    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] ans =intersect(nums1,nums2);
		System.out.println(Arrays.toString(ans));
	}

}

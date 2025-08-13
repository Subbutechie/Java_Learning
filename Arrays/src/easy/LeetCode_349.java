package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_349 {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i =0;i<nums1.length;i++){
            if(mp.containsKey(nums1[i])){
                mp.put(nums1[i],mp.get(nums1[i])+1);
            }else{
                mp.put(nums1[i],1);
            }
        }
        HashSet<Integer> dup = new HashSet<Integer>();
		
        for(int x = 0; x<nums2.length; x++) {
        	if(mp.containsKey(nums2[x])) {
        		dup.add(nums2[x]);
        	}
        }
        
        
        return dup.stream().mapToInt(Integer::intValue).toArray();        
        
    }
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] ans = intersection(nums1, nums2);
		System.out.println(Arrays.toString(ans));
		List<Integer> ls = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		
		
	}

}

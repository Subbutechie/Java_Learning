package challenges;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class LongestConsecutiveSequence {
	
	public static void main(String[] args) {
		int[] arr = {100, 4, 200, 1, 3, 2}; 
        System.out.println(LongestConsecutive(arr));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
	}

	private static int LongestConsecutive(int[] arr) {
		
		HashSet<Integer> set = new HashSet<Integer>();
        for(int x : arr){
            set.add(x);
        }
        
        int maxLen = 0;
        for(int num : set){
            //This checks the num is a potential start of an sequence
            if(!(set.contains(num-1))){
                int currentNum = num;
                int tempLen = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    tempLen++;
                }
                maxLen = Math.max(tempLen, maxLen);
            }
            
            
        }
        return maxLen;
    
	}

}

package medium;

import java.util.ArrayList;

public class ThreeSumOpt {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,0,4};
		System.out.println(findSplit(arr).toString());
	}

	private static ArrayList<Integer> findSplit(int[] arr) {
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		int total = 0;
		for(int ele:arr) {
			total += ele;
		}
		
		if(total%3 != 0) {
			res.add(-1);
			res.add(-1);
			return res;
		}
		
		//keep track of the cuurentsum
		int currentSum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			currentSum += arr[i];
			
			//if it satisfies the condition store the index and reset the sum to zero
			//if currentsum is one-third of the total sum of all the elements
			if(currentSum == total/3) {
				res.add(i);
				currentSum = 0;
			}
			
			//check the final condition there are two indices that means two subsets are found
			//if the there is atleast one element available to make the third subset we return the res
			if(res.size() == 2 && i< arr.length-1) {
				return res;
			}
			
		}
		//if no index pair is possible return -1,-1
		res.add(-1);
		res.add(-1);
		return res;
	}

}

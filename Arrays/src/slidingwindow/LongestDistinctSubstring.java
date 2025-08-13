package slidingwindow;

import java.util.HashMap;

public class LongestDistinctSubstring {
	public static void main(String[] args) {
		String s = "eceba";
		int k = 2;
		System.out.println(findSubString(s,k));
	}

	//Here I am trying to return the length of longest substring with at most k distinct characters
	public static String findSubString(String s, int k) {
		
		String resstr = "";
		int windowLen = 0;
		int maxLen = Integer.MIN_VALUE;
		for(int i = 0; i<s.length(); i++) {
			HashMap<Character,Integer> memo = new HashMap<>();
			int j = i;
			while(memo.size() < k) {
				if(memo.containsKey(s.charAt(j))) {
					memo.put(s.charAt(j),memo.get(s.charAt(j))+1);
				}else {
					memo.put(s.charAt(j), 1);
				}
				j++;
			}
			windowLen = j - i;
			if(windowLen>maxLen) {
				resstr = s.substring(i,j);
			}
			 
			
		}
		System.out.println(resstr);
		return resstr;
	}

}

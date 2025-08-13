package easy;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_2287 {
	
	
	public static void main(String[] args) {
		System.out.println(rearrangeCharacters("zys","adk"));
	}
	
	
	public static int  rearrangeCharacters(String s, String target) {
		
		if(s.length()<target.length()){
	        return 0;
	    }
		
	

        HashMap<Character, Integer> mp = new HashMap<Character,Integer>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j =0; j<target.length(); j++){
                if(ch == target.charAt(j)){
                	if(mp.containsKey(ch)) {
                		 mp.put(ch,mp.get(ch)+1);
                		 break;
                	}
                	else {
                		mp.put(ch,1);
                		break;
                	}
                }
            }
        }
        
        
       
        
        int minValue = Collections.min(mp.entrySet(), Map.Entry.comparingByValue()).getValue();
        
        if(mp.size() == 1) {
        	System.out.println("min value:"+minValue);
        	return minValue/target.length();
        }
        
        
       return minValue;
        
        
    }
	

}

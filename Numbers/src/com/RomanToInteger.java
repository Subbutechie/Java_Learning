package com;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		romanToInt("MCMXCIV");
	}
	
	 public static void romanToInt(String s) {
	        HashMap<Character,Integer> map = new HashMap<>();

	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        int val = 0;
	        //map.forEach((key,val) -> System.out.println(key+" - "+val));
	        
	       
	        if(s.length() == 1) {
	        	val += map.get(s.charAt(0));
	        	System.out.println(val);
	        	return ;
	        }
	        //lets say we have two pointers
	        int i =0;
	        int j =1;
	        while(i<s.length() && j<=s.length()-1){
	        	if(map.get(s.charAt(i))<map.get(s.charAt(j))) {
        			val += map.get(s.charAt(j))-map.get(s.charAt(i));
        			j+=2;
        			i+=2;
        		}else {
        			val += map.get(s.charAt(i));
        			i++;
        			j++;
        		}

	        }
	        
	        if(i<s.length()) {
	        	val += map.get(s.charAt(i));
	        }
	       	        
	        
	        System.out.println(val);
	    }
}

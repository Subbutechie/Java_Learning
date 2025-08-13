package com;

import java.util.function.Function;

public class Test {
	
	public static void main(String[] args) {
		String str = "Subbu";
		
		Function<String, Integer> strlength = s -> s.length();
		
		//apply(T,R)
		
		 int len = strlength.apply(str);
		 System.out.println(len);
		 
		 
	}

}

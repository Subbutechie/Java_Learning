package com;

import java.util.ArrayList;
import java.util.List;

public class problem {

	public static void main(String[] args) {
		int[] arr = {1,3,0,9,0,0,1,0,0,0,0};
		
		int k =5;
		
		method(arr,k);
	}

	private static void method(int[] arr, int k) {
		
		
			int n =arr.length;
			List<Integer> ls = new ArrayList<Integer>();
			
			for(int i =0; i<n-1; i++) {
				if(arr[i] ==0) {
					if(arr[i+1] != 0) {
						ls.add(arr[i]);
						ls.add(k);
					}
					else {
						ls.add(arr[i]);
					}
				}else {
					ls.add(arr[i]);
				}
			}
			
			if(arr[n-1] == 0) {
				ls.add(arr[n-1]);
				ls.add(k);
			}
			
			
			for(int x: ls) {
				System.out.print(x+" , ");
			}
	}
	

}

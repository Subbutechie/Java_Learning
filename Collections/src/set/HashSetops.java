package set;

import java.util.HashSet;

public class HashSetops {
	
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		
		
		for(int num:hset) {
			System.out.println(num);
		}
	}

}

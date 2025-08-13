package set;

import java.util.LinkedHashSet;

public class LinkedHashSetops {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
		
		lhset.add(10);
		lhset.add(20);
		lhset.add(30);
		lhset.add(40);
		lhset.add(50);
		
		for(int num: lhset) {
			System.out.println(num);
		}
	}

}

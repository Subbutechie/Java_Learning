package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetops {
	
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		tset.add(10);
		tset.add(20);
		tset.add(30);
		tset.add(40);
		tset.add(50);
		
		
		for(int num : tset) {
			System.out.println(num);
		}
		
		SortedSet<Integer> s =  tset.subSet(20,40);
		System.out.println(s);
		
	}

}

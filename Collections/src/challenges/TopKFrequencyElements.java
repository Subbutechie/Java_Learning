package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequencyElements {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		KMostfrequentNums(arr, k);
	}

	public static void KMostfrequentNums(int[] arr, int k) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int num : arr) {
			mp.put(num, mp.getOrDefault(num, 0) + 1);

		}

		/*
		 * mp.entrySet().stream().forEach((x) -> System.out.println(x.getKey()
		 * +" - "+x.getValue()));
		 */

		// Creating an arrayList with the entrySet() as arguments
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mp.entrySet());

		// System.out.println(entryList);

		// This sorts the arrayList on the basis of value
		entryList.sort((a, b) -> b.getValue() - a.getValue());

		// Now we can just the sorted key values based on k
		for (int i = 0; i < k; i++) {
			System.out.println(entryList.get(i).getKey());
		}
	}
}

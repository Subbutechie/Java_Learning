package simpleProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice_problems {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,3,5,53,4,16,17);
		Map<Boolean, List<Integer>> map  = nums.stream().collect(Collectors.partitioningBy(i -> i%2 ==0));
		System.out.println(map);

		
		//Remove duplicate elements
		List<String> data = Arrays.asList("Java", "java", "subbu", "srikar", "subbu");
		List<String> unique =  data.stream().distinct().collect(Collectors.toList());
		System.out.println("Printing the output:"+unique);
		
		//Finding the frequency of each character 
		String inputString = "subbu";
		Map<Character,Long> mp =  inputString.chars().mapToObj(c -> (char)c).
					collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		mp.entrySet().stream().collect(Collectors.mapping(e -> e.getKey(), null));
		System.out.println(mp);
		
		//sort the decimals in reverse orders
		List<Double> UnsortedDecimals = Arrays.asList(2.3,44.3,5.3,3.3,6.4);
		UnsortedDecimals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//Find maximum and minimum of those numbers
		int max = nums.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
		int min = nums.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		
		//Merge two unsorted arrays into one sorted array
		int[] arr1 = {33,14,53,1,5,4};
		int[] arr2 = {0,35,55,645};
		
		int[] sorted =IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr1)).sorted().toArray();
		System.out.println(Arrays.toString(sorted));
		
		//Get three max numbers and three min numbers
		//This will give the min because of returning first 3 after sorted
		System.out.println("-----------------------");
		System.out.println(nums);
		List<Integer> minList = nums.stream().sorted().limit(3).toList();
		System.out.println(minList);
		nums.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		//check if two strings are anagrams or not
		
	}

}

package challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetFirstNonRepeatingChar {
	//Without using streams you can use Linkedhashmap since it preserves the insertion order so that we can
	//return the first non repeating char
	
	//But I want to use streams here
	
	public static void main(String[] args) {
		String s = "aabb";
		
		
		Map<Character, Long> freqEntry =  s.chars().mapToObj(c -> (char)c).
		collect(Collectors.groupingBy(c -> c,LinkedHashMap::new, Collectors.counting()));
		
		freqEntry.entrySet().stream().filter(entry -> entry.getValue() == 1).
		map(Map.Entry::getKey).findFirst().ifPresentOrElse(ch -> System.out.println("The index is : "+s.indexOf(ch)), ()->System.out.println("-1"));
		
		List<String> words = Arrays.asList("hi", "hello", "hey", "world", "sun");
		Map<Integer,List<String>> mp = words.stream().collect(Collectors.groupingBy(String::length,Collectors.mapping(Function.identity(), Collectors.toList())));
		
		System.out.println(mp);
		
		List<Integer> nums = Arrays.asList(4, 2, 7, 6, 5, 8, 2, 4);
		
		String str = nums.stream().filter(n -> n%2 ==0).sorted(Comparator.naturalOrder()).map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(str);
		
		List<String> words1 = Arrays.asList("apple", "banana", "avocado", "apricot", "blueberry");
		words1.stream().map(String::toUpperCase).filter(word -> word.startsWith("A")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> word = Arrays.asList(
			    "apple", "banana", "apple", "orange", "banana",
			    "apple", "grape", "banana", "orange", "grape"
			);
		List<String> ls= word.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
		sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(Map.Entry::getKey).toList();
		
		System.out.println(ls);
		
		List<String> strings = Arrays.asList(
			    "java", "stream", "lambda", "stream", "collection", "java", "stream"
			);
		
		String ans =  strings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
		filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println("Longest String is "+ans);
		
		Optional<String> res =  strings.stream().max(Comparator.comparingInt(String::length));
		
		res.ifPresent(System.out::println);
		
	}

}

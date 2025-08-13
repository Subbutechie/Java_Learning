package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.testData.Person;

public  class LamdaExpression{
	

	public static void main(String[] args) {
		
		//For-each method
		List<String> names = Arrays.asList("Arjun", "SubbaReddy","Srikar");
		
		names.forEach(name -> System.out.println(name.toUpperCase()));
		
		//Using Stream API with "filter" to Filter Data
		names.stream().filter(name -> name.startsWith("A"))
		.forEach(System.out::println);
		
		//Using Stream API with "map" to Transform Data
		//The map() function in Java’s Stream API is used to transform elements in a stream.
		//It applies a given function (often provided as a lambda expression or method reference) to each element of the stream and 
		//returns a new stream containing the transformed elements.
		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		
		//Using Stream API with "reduce" to Aggregate Data
		//It is typically used for aggregation operations, such as summing, multiplying, concatenating,
		//or combining objects. The reduce() method takes two arguments: an identity (the starting value)
		//and a binary operator (a function that takes two elements and combines them).
		List<Integer> num = Arrays.asList(1,45,2,78,3,4,5,8,2,49,11);
		Optional<Integer> sum =num.stream().reduce((a,b) -> a+b);
		sum.ifPresent(System.out::println);
		
		
		//sorted() Method
		num.stream().sorted((a,b) -> a-b).forEach(System.out::println);
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		//Filter and print only even numbers
		numbers.stream().filter(n -> n%2==0).forEach(System.out::println);		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		words.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		
		String str = "hello";
		List<String> words1 = Arrays.asList("world", "java");
		words1.stream().map(str::concat).forEach(System.out::println);

		List<String> Names = Arrays.asList("Steve", "Amanda", "Paul", "Alice");
		String ans = Names.stream().filter(x -> x.startsWith("A")).findFirst().orElse("Element not found");
		System.out.println(ans);
		
		
		//filter and group them it is with either even or odd
		Map<String, List<Integer>> grouped = numbers.stream().
				collect(Collectors.groupingBy(n -> n%2 ==0 ? "Even" : "Odd"));
		System.out.println(grouped);
		
		//Find the sum of squares of even numbers
		int res = numbers.stream().filter(n -> n%2 == 0).map(n ->n*n).reduce(0,Integer::sum);
		int res1 = numbers.stream().filter(n -> n% 2 == 0).map(n -> n*n).reduce(0, (a,b) -> a+b);
		System.out.println(res1);
		
		//Flat the lists and calculate the sum
		List<List<Integer>> listOfLists = Arrays.asList( Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9) );
		
		int sum2= listOfLists.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
		
		//Count the occurrences of words
		List<String> word = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
		Map<String,Long> wordCount = word.stream().
				collect(Collectors.groupingBy(x -> x,Collectors.counting()));
		
		System.out.println(wordCount);
		
		//Find the maximum value
		 int max = numbers.stream().max(Integer::compareTo).map(Integer::intValue).orElse(0);
		 System.out.println(max);
		 
		 //Sort the numbers and add them into a new List
		 List<Integer> Unsortednumbers = Arrays.asList(5, 3, 8, 1, 2, 7, 4, 6);
		 List<Integer> sortedList = Unsortednumbers.stream().sorted().collect(Collectors.toList());
		 List<Integer> reverseSorting = Unsortednumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 
		 System.out.println(reverseSorting);
		 
		 //sort a list of custom objects by their age
		 List<Person> people = Arrays.asList(
				    new Person("Alice", 30),
				    new Person("Bob", 25),
				    new Person("Charlie", 35),
				    new Person("David", 28)
				);
		 
		 List<Person> sortedbyAgeAsc = people.stream().sorted((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())).
		 					collect(Collectors.toList());
		 System.out.println(sortedbyAgeAsc);
		 
		 List<Person> sortedByAgeDESC = people.stream().sorted((a,b) -> Integer.compare(b.getAge(), a.getAge())).collect(Collectors.toList());
		 System.out.println(sortedByAgeDESC);
		 
	}
	
	
	
	
}

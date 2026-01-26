package StreamAIP;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class MyTask01 {

	public static void main(String[] args) {
	//	Arrays based Question
		
		//1.print even numbers
		int [] data = {1,2,3,4,5,6};
		Arrays.stream(data)
		.filter((x)->x%2 == 0)
		.forEach(System.out::println);
		
		//2.MaxValue
		int[] data2 = {10,40,20,5,90};
		OptionalInt arr=Arrays.stream(data2)
		.max();
		System.out.println(arr);
		
		//3.MinValue
		OptionalInt arr2 =Arrays.stream(data2)
		.min();
		System.out.println(arr2);
		
		//Array -> List Conversion
		int[] data3 = {3,6,9,12};
		
		List<Integer> list=Arrays.stream(data3)
		.boxed()
		.toList();
		System.err.println(list);
		
        //String Starting with A
		String[] names = {"Arun","Main","Ajay","Kumar"};
		
		Arrays.stream(names)
		.filter((x)->x.startsWith("A"))
		.forEach(System.out::println);
		
		
		//String array uppercase
		String [] fruits = {"apple","mango","banana"};
		
		Arrays.stream(fruits)
		.map((x)->x.toUpperCase())
		.forEach(System.out::println);
		
		//Count vowels
		String str ="hello world";
		
		Predicate<Character> p1 =(x)-> x == 'A' || x=='E' || x=='I' || x=='O' || x=='U';
		Predicate<Character> p2 =(x)-> x == 'a' || x=='e' || x=='i' || x=='o' || x=='u';
		

		str.chars()
		.mapToObj((x)->(char)x)
		.filter(p1.or(p2))
		.forEach(System.out::println);
		
		
		
	}

}

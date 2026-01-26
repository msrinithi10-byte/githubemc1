package StreamAIP;

import java.util.Arrays;
import java.util.function.Predicate;

public class StringUsingStream {

	public static void main(String[] args) {
		
		//using String to Stream 
		String s="java";
     
		
		s.chars()
		.mapToObj((x)->(char)x)
		.forEach(System.out::println);
		
		String s1 = "the java programming";
		String[] arr= s1.split(" ");
		
		Arrays.stream(arr)
		.forEach(System.out::println);
		
		String s1 = "the java programming";
		Predicate<Character> p1 =(x)-> x == 'A' || x=='E' || x=='I' || x=='O' || x=='U';
		Predicate<Character> p2 =(x)-> x == 'a' || x=='e' || x=='i' || x=='o' || x=='u';
		
		s1.chars()
		.mapToObj((x)->(char)x)
		.filter(p1.or(p2))
		.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

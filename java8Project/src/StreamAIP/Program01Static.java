package StreamAIP;

import java.util.stream.Stream;

public class Program01Static {
	public static void main(String args[])
	{
		//Static method -----------
		
		//Empty
		Stream<String> s=Stream.empty();
		s.forEach(System.out::println);
		
		//Iterator
		Stream<Integer> s1= Stream.iterate(1, (Integer i)->i+1).limit(10);
		s1.forEach(System.out::println);
		
		//Generate
		Stream<String> s2= Stream.generate(()->"hello").limit(10);
		s2.forEach(System.out::println);
		
		//of
 	    Stream<String> s3=Stream.of("hello","ravi","how","are","you");
 	    s3.forEach(System.out::println);
 	 
	}

}

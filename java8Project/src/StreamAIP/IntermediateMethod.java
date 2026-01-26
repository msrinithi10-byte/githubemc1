package StreamAIP;

import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateMethod {
	public static void main(String args[])
	{
		/*Stream<String> s=Stream.of("hello","ravi","raja");
		Stream<String> s1=s.filter((x)->x.length()==4);
		s1.forEach(System.out::println);*/
		
		//Filter
		Stream.of("hello","ravi","raja")
		.filter((x)->x.length()==4)
		.forEach(System.out::println);
		
		//Map
		Stream.of("hello","hi","ravi")
		.map((x)->x.length())
		.forEach(System.out::println);
		
		//mapToInt
		Stream.of("hello")
		.mapToInt((x)->x.length())
		.forEach(System.out::println);
		
		//mapToDouble
		Stream.of("hello","ravi")
		.mapToDouble((x)->x.length())
		.forEach(System.out::println);
		
		//mapToLong
		Stream.of("hello")
		.mapToLong((x)->x.length())
		.forEach(System.out::println);
		
		//Sorted
		Stream.of(3,4,6,1,0,8)
		.sorted()
		.forEach(System.out::println);

		//Sorted(Comparator)
		
		Comparator<Integer> com = new Comparator<>()
				{

					@Override
					public int compare(Integer o1, Integer o2) {
						if(o1<o2)
						{
						return 1;
						}
						else if(o1>o2)
						{
						return -1;	
						}
						else {
						return o2;
						}
					}
					};
		
					Stream.of(3,4,6,1,0,8)
					.sorted(com)
					.forEach(System.out::println);
					
					//distinct
					Stream.of(2,3,4,5,6,7,7,6)
					.distinct()
					.forEach(System.out::println);
					
					//limit
					Stream.of(2,3,4,5,6,7,7,6)
					.limit(3)
					.forEach(System.out::println);
					
					//Skip
					Stream.of(2,3,4,5,6,7,7,6)
					.skip(5)
					.forEach(System.out::println);
	}

}

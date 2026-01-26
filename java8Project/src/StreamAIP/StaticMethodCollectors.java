package StreamAIP;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StaticMethodCollectors {

	public static void main(String[] args) {
		List<Integer> list1=  Stream.of(1,2,3,4,5)
		.collect(Collectors.toList());
		System.out.println(list1);
		
		Set<Integer> s=Stream.of(1,2,3,4,5,5,6)
		.collect(Collectors.toSet());
		System.out.println(s);
		
		ArrayDeque<Integer> arr=Stream.of(1,2,3,4,5,6,7)
		.collect(Collectors.toCollection(()->new ArrayDeque<Integer>()));
		System.out.println(arr);
		
		//String Joinig
		//1.joining
		String s1=Stream.of("A","B","C","D","E")
		.collect(Collectors.joining());
		System.out.println(s1);
	    //2.joining(delimiter)
		String s2=Stream.of("A","B","C","D","E")
				.collect(Collectors.joining(","));
				System.out.println(s2);
		//3.joining(delimiter,prefix,suffix)
	     String s3=Stream.of("A","B","C","D","E")
			.collect(Collectors.joining(",","{", "}"));
			System.out.println(s3);
		
		//Count and Summarzing
			//1.counting()
		Long In=	Stream.of(1,2,3,4,5)
			.collect(Collectors.counting());
		System.out.println(In);
		
		//2.SummingInt
		System.out.println("sum");
		Integer In2 = Stream.of(1,2,3,4,5)
		.collect(Collectors.summingInt((x)->x));
				
		System.out.println(In2);	
	   //3.SummingDuble
	    Double d = Stream.of(1,2,3,4,5)
		.collect(Collectors.summingDouble((x)->x));
						
		System.out.println(d);	
	    //4.SummingLong
		long l = Stream.of(1,2,3,4,5)
		.collect(Collectors.summingLong((x)->x));
								
		System.out.println(l);	
		//Average
		//1.AveageingInt
	   Double d1= Stream.of(1,2,3,4,5)
	   .collect(Collectors.averagingInt((x)->x));
	 System.out.println(d1);
	 
	 //2.AveragingDouble
	 Double d2 =Stream.of(1,2,3,4)
	 .collect(Collectors.averagingDouble((x)->x));
	 System.out.println(d2);
	 //3.AveragingLong
	 Double d3 =Stream.of(1,2,3,4)
	 .collect(Collectors.averagingLong((x)->x));
	 System.out.println(d3);
	 
	 IntSummaryStatistics sum =Stream.of(1,2,3,4)
			 .collect(Collectors.summarizingInt((x)->x));
			 System.out.println(sum.getMax());
	 
	 //MinBy
			 Optional<Integer> Op =Stream.of(1,2,3,5,7,8,9)
			 .collect(Collectors.minBy((a,b)->a-b));
	 System.out.println(Op);
	 
	 //MaxBy
	 Optional<Integer> Op1 =Stream.of(1,2,3,5,7,8,9)
	 .collect(Collectors.maxBy((a,b)->a-b));
     System.out.println(Op1);

	 //Reducing
     //1.reducing
    Optional<Integer> op2= Stream.of(1,2,3,4,5,6)
     .collect(Collectors.reducing((x,y)->x+y));
	 System.out.println(op2);
	 
	 //2.reducing(identity)
      Integer op3 = Stream.of(1,2,3,4,5,6)
	  .collect(Collectors.reducing(0,(x,y)->x+y));
       System.out.println(op3);
	 //3.reducing(identity,BinaryOperation)
       Integer op4 = Stream.of("AA","B")
       .collect(Collectors.reducing(0,(x)->x.length(),(x,y)->x+y));
       System.out.println(op4);
	 
     //Mapping and Transfromation
      List<Integer> in= Stream.of("aa","dd","cc")
       .collect(Collectors.mapping((x)->x.length(), Collectors.toList()));
    		 System.out.println(in);
       
p[      Stream.of("aa","c","d")
    .collect(Collectors.collectingAndThen(Collectors.toList(),(x)->x.size()));
    
       
	}
}

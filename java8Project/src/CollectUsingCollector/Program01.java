package CollectUsingCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program01 {
	public static void main(String[] args) {
		
	   List<Integer> li= Stream.of(1,2,3,4,5,6)
	    .collect(Collectors.toList());
	   System.out.println(li);
	   
	 List<Integer> list = new ArrayList<>(List.of(1,2,3,4,6));
	   
	Collector<Integer,ArrayList<Integer>,Integer> col = Collector.of(
			                                            //Supplier
			                                           ()->new ArrayList<Integer>(),
			                                            
			                                           //Accumulator
			                                           (arr,element)->{
			                                        	   if(arr.size()==0)
			                                        	arr.add(element);
			                                        	   int sum=arr.get(0)+element;
			                                        	   arr.set(0, sum);
			                                           },
			                                           (arr1,arr2)->
			                                           {
			                                        	   int sum=arr1.get(0)+arr2.get(0);
			                                        	   arr1.set(0,sum);
			                                        	   return arr1;
			                                        	   
			                                           }, 
			                                           
			                                           (arr)->arr.get(0)
			                                           ); 
	
	                                                   Integer sum=list.stream()
	                                                  // .parallel()
	                                                   .collect(col);
	                                                   System.out.println(sum);
	 
	 List<String> arr = new ArrayList<>(List.of("hello","hi","ravi"));
	 
	
	}

}

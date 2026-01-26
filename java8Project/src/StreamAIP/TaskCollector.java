package StreamAIP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class TaskCollector {
	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
	
	Collector<Integer,StringBuilder,String> col = Collector.of(
			                                
			 ()->new StringBuilder(),
			 
			  (arr,element)->
			 {
				 if(arr.length()>0)
					 arr.append(",");
					 arr.append(element);
			 },
			 
			 (arr1,arr2)->
			 {
				 if(arr1.length()>0 && arr2.length()>0);
				 arr1.append(",");
				 arr1.append(arr2);
				 return arr1;
			 },
			
			 (arr)->arr.toString()
			
			);
	
	
	
	
	 String s =list.stream()
	.collect(col);
	 
	 System.out.println(s);
	 
	 
	/* List<String> list2 = new ArrayList<>(List.of("A","B","A","C","D"));
	 
	 Collector<String,ArrayList<String>,Map<String,Integer>> coll = Collector.of(
			  ()-> new ArrayList<String>(), 
			  
			   (A,B)->A.add(B), 
			   
			 (A,B)->
			   {
				   if(A.length()>0 && B.length()>0)
					A.Add(b);
				   return A;
				   
			   }, 
			 null) ;
	 
	 
	 
	list2.stream()
	.collect(null);*/
	 
	 
	 
	
	}

}

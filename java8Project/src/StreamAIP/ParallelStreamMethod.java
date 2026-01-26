package StreamAIP;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelStreamMethod {

	public static void main(String[] args) {
		
		Stream.of("hello","hi","ravi")
        .parallel()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5));
	    list.parallelStream()
	    
	    .forEach((x)-> { System.out.println(x+"-"+Thread.currentThread().getName());});
	
	    
	  
	}

}

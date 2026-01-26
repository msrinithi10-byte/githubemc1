package StreamAIP;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsMethod {

	public static void main(String[] args) {
		
		Map<String, Integer> map=Stream.of("AA","BB","C","DDD")
		.collect(Collectors.toMap((x)->x,(x)->x.length()));
		System.out.println(map);
		
               Stream.of("AA","BB","C","DDD","AA")
				.collect(Collectors.toMap((x)->x,(x)->x.length(),(o,n)->n));
				System.out.println(map);
				
				//toConcurrentMap
				Stream.of("AA","BB","C","DDD","AA")
				.collect(Collectors.toConcurrentMap((x)->x,(x)->x.length(),(o,n)->n));
				System.out.println(map);
				
				
				//Filtering
				 List<String> li =Stream.of("AA","BB","C","DDD","AA")
				 .collect(Collectors.filtering((x)->x.length() == 2,Collectors.toList()));
				System.out.println(li);
				
				//FlatMap
				String[] arr = {"one,two","three,four"};
				List<String> list=Arrays.stream(arr)
				.collect(Collectors.flatMapping((x)->Arrays.stream(x.split(",")),Collectors.toList()));
				
				System.out.println(list);
				
				List<String> li1=Stream.of("A,B","C,D","E,F")
				.collect(Collectors.flatMapping((x)->Arrays.stream(x.split(",")), Collectors.toList()));
	
	System.out.println(li1);
	
	
	
	
	
	
	
	
	
	
	}
}

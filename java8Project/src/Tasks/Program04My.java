package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program04My {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("one","two","three","four","one"));
		
		 Map<Object, Long> map=list.stream()
		.collect(Collectors.groupingBy((x)->x,Collectors.counting()));
		 System.out.println(map);
		 
		 
		 
		
	}

}

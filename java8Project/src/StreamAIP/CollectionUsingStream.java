package StreamAIP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUsingStream {

	public static void main(String[] args) {
	 ArrayList<Integer> arr= new ArrayList<>(List.of(1,2,3,4,5));
	 arr.stream()
	 .filter((x)->x%5==0)
	 .forEach(System.out::println);
	 
	 Set<String> set= new HashSet<>(Set.of("hello"));
	 set.stream()
	 .map((x)->x.toUpperCase())
	 .forEach(System.out::println);
	 
	 HashMap<String,String> has = new HashMap<>();
	 has.put("h1", null);
	 has.put("h2", null);
	 has.put("h3", null);
	
	 
	 Set<String> set1 = has.keySet();
	 set1.stream()
	 .forEach(System.out::println);
	 
	 
	 
	
	}

}

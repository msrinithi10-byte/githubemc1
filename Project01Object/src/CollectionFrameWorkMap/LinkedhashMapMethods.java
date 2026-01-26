package CollectionFrameWorkMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMapMethods {

	public static void main(String[] args) {
		LinkedHashMap<String,String> arr = new LinkedHashMap<>(16,0.75f,true);
		arr.put("A", "name1");
		arr.put("B", "name2");
		arr.put("C", "name3");
		arr.put("D", "name3");
		
		System.out.println(arr);
		
		/*arr.remove("A");
		//System.out.println(arr.remove("c", "name3"));
		System.out.println(arr);
		
		System.out.println(arr.get("B"))
		System.out.println(arr.containsKey("A"));
		System.out.println(arr.containsValue("name3"));
		
		for(String s:arr.keySet())
		{
			System.out.println(s);
			
		}
		for(String s:arr.values())
		{
			
			System.out.println(s);
		}
		 
		for(Map.Entry<String,String> s2:arr.entrySet())
		{
			System.out.println(s2);
		}
		arr.clear();
		System.out.println(arr);
	    System.out.println(arr.isEmpty());*/
		
		/*arr.put("Ea", "name1");
		arr.put("FB", "name2");
		System.out.println(arr);*/
		
		arr.putIfAbsent("D","name4");
		System.out.println(arr);
		
		System.out.println(arr.getOrDefault("A", "Default value"));
		
		arr.get("A");
		System.out.println(arr);

	}

}

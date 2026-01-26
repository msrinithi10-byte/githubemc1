package CollectionFrameWorkMap;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
	
	public static void main(String args[])
	{
		Map<String ,String> map=new HashMap<>();
		map.put("AA","value1");
		map.put("AA","value2");
		map.put("AA","value3");
		map.put("DD","value4");
        
		//System.out.println("DD".hashCode()%16);
		
		System.out.println(map);
		
		
		Map<String ,String> map1=new HashMap<>();
		
		map1.putAll(map);
		
		System.out.println(map1);//copy the another object value
		
		System.out.println(map.get("AA"));//retrive the value
		
		map.remove("AA");
		map.remove("BB","value2");
		System.out.println(map);
		
		System.out.println(map.containsKey("AA"));//return boolean value
		System.out.println(map.containsValue("value2"));
		
		for(String s:map.keySet())
		{
			
			System.out.println(s);
		}
		
		for(String s1:map.values())
		{
			System.out.println(s1);
			
		}
		
		for(Map.Entry<String,String> s2:map.entrySet())
		{
			
		System.out.println(s2);	
		}
		
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		/*map.put("FB", "name1");
		map.put("Ea", "name2");
		System.out.println(map);
		
		map.put("apple", "name3");
		map.put("papa","name4");
		System.out.println("apple".hashCode()%16);
		System.out.println("papa".hashCode()%16);*/
		
		
	}

}

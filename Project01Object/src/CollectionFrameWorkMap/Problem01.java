package CollectionFrameWorkMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem01 {
	
	public static void main(String args[])
	{
		/*ArrayList<Integer> list = new ArrayList<>();
		list.add(13);
		list.add(2);
		list.add(7);
		list.add(13);
		list.add(7);
		
		//System.out.println(arr);
		Map<Integer,Integer> map= new HashMap<>();
		
		for(Integer i : list)
		{
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> s:map.entrySet())
		{
			System.out.println(s.getKey()+"--"+s.getValue());
			//System.out.println(map.get(i)+"--"map.get(in));
		}*/
	
	
	 
         String s="hello World";
         String[] arr=s.split("");
         HashMap<String,Integer> map1= new HashMap<>();
         
         for(String St :arr)
         {
        	map1.put(St,map1.getOrDefault(St, 0)+1); 
        	 
         }
         
         
        for(Map.Entry<String,Integer> s1 : map1.entrySet())
         {
        	 System.out.println(s1.getKey()+"----"+s1.getValue());
        	 
         }
         
         
         
}
}
package CollectionMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

	public static void main(String[] args) {
		//List---immutabale
		List<Integer>list=List.of(1,2,3,4,5,6);
		System.out.println(list);
		//list.add(8);//UnsupportedOperationException
		ArrayList<Integer> arr=new ArrayList<Integer>(list);
		arr.add(7);
		System.out.println(arr);
		
		//Arrays class--mutable
		List<Integer>li = Arrays.asList(1,2,3,4,5);
		System.out.println(li);
        //li.add(12);//UnsupportedOperationException
		li.set(0,7);//--change value is possible
        System.out.println(li);
        
        //Set----immutable
        Set<Integer> set= Set.of(1,2,33,4,45);//IllegalArgumentException(duplicates)
        System.out.println(set);
        Set<Integer> has = new  HashSet<Integer>(set);
        has.add(12);
        has.remove(1);
        System.out.println(has);
        
        //MAP----immutable
        Map<String,String>maps = Map.of("A","B");
        System.out.println(maps);
        
        Map.Entry<Integer, String> map= Map.entry(1,"name1");
        System.out.println(map);
       
        Map<Integer, String>map1= Map.ofEntries( Map.entry(1,"name1"), Map.entry(2,"name1"));
		//map1.put(3, "A");//UnsupportedOperationException
        System.out.println(map1);
		
		Map<Integer, String> map2 = new HashMap<>(map1);
		map2.put(12, "name2");
		System.out.println(map2);
		
		

	}

}

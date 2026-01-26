package CollectionFrameWorkMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {
	public static void main(String args[])
	{
		Map<Integer,String> tmap = new TreeMap<>();
		/*tmap.put("B","Name1");
		tmap.put("A", "name2");
		tmap.put("Z", "name3");*/
		
		tmap.put(1,"raja");
		tmap.put(2, "ravi");
		tmap.put(7, "raja");
		tmap.put(8, "ravi");
		
		/*System.out.println(tmap);
		tmap.put(3, "rea");
		System.out.println(tmap);
		System.out.println(tmap.get(2));
		System.out.println(tmap.containsKey(2));//return boolean value the index will be there or not
		System.out.println(tmap.containsValue("ravi"));
		System.out.println(tmap.remove(2));
		System.out.println(tmap);
	    System.out.println(tmap.size());
	    tmap.clear();
	    System.out.println(tmap);
	    System.out.println(tmap.isEmpty());*/
		
		//SortedMap Methods 
		SortedMap<Integer,String> map = new TreeMap<>();
		map.put(1,"raja");
		map.put(2, "ravi");
		map.put(3, "raja");
		map.put(4, "ravi");
		map.firstKey();
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
	    System.out.println(map.headMap(4));//less than the given value it will return
	    System.out.println(map.tailMap(2));//greater than the given value 2,3,4
	    System.out.println(map.subMap(1,3));//return the vale 1to3 like 1,2
	    System.out.println(map.comparator());
	    
	    
	    //NavigableMap Methods
	
	    NavigableMap<Integer,String> maps = new TreeMap<>();
	    maps.put(1,"raja");
		maps.put(3, "ravi");
		maps.put(5, "raja");
		maps.put(4, "ravi");
	    System.out.println(maps.firstEntry());//return lessthan value
	    System.out.println(maps.lastEntry()); //return graterthan value
	    System.out.println(maps.ceilingEntry(3));//return the given value(3,raja)(key,value)
	    System.out.println(maps.ceilingKey(5));//return only given key.the key will not there it will retrun null value
	    System.out.println(maps.floorEntry(2));//return (key and value) for given key value
	    System.out.println(maps.floorKey(10));//0--null, grater value they will return the value
	    System.out.println(maps.higherEntry(4));//given value -- next value return
	    System.out.println(maps.higherKey(1));//given value key --- next key return
	    System.out.println(maps.lowerEntry(4));//given value -- lessthan value return
	    System.out.println(maps.lowerKey(2));//given value key --- lessthan key return
	    //System.out.println(maps.pollFirstEntry());
	    //System.out.println(maps);
        //System.out.println(maps.pollLastEntry());
        //System.out.println(maps);
	    System.out.println( maps.descendingMap());
        System.out.println(maps.descendingKeySet());
        System.out.println(maps.navigableKeySet());//ascending order
        System.out.println(maps.headMap(3, true));//false-- given lessthan true--lessthan value with given value
        System.out.println(maps.tailMap(3, true));
        System.out.println(maps.subMap(1, false, 4, true));
	}

}

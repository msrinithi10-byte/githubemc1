package CollectionIteratorMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program02ConCurrent {
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,4,5,1,7,3,8));
		
		CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<Integer>(arr);
		
		ListIterator<Integer>it = copy.listIterator();
		System.out.println(copy);
		
		while(it.hasNext())
		{
			Integer x= it.next();
			if(it.nextIndex() == 2)
			{
			copy.add(1,5);
			}
	    }
		
		System.out.println(copy);
		
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(12,3,4,5,66));
		
		ConcurrentLinkedDeque<Integer> link= new ConcurrentLinkedDeque<Integer>(list);
	  	Iterator<Integer> it1=link.iterator();
	  	System.out.println(link);
		
	  	while(it1.hasNext())
		{
			Integer x= it1.next();
			link.add(8);
			
	    }
		
		System.out.println(link);
		
		HashMap<Integer,String> hash = new HashMap<>();
		hash.put(1,"a");
		hash.put(3,"b");
		hash.put(2, "c");
		ConcurrentHashMap<Integer,String> hmap = new ConcurrentHashMap<>(hash);
		
		for(Map.Entry<Integer, String> s : hmap.entrySet())
		{
		   // hmap.put(4,"D");
		   // hmap.put(6,"e");
			System.out.println(s);			
		}

		
		
		
		
		
		

		//ConcurrentModificationException
		/*while(it.hasNext())
		{
			Integer x= it.next();
			arr.add(2);
			
		}*/
		
		
		
	}

}

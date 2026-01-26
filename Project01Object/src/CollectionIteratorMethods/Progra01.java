package CollectionIteratorMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Progra01 {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList(Arrays.asList(1,2,4,3,7,6));
		
		System.out.println(arr);
		
		Iterator<Integer> it=arr.iterator();
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
		while(it.hasNext())
		{
		  Integer x=it.next();
			if(x==4)
			{
			it.remove();	
			}
		}
		System.out.println(arr);
		
		//List--Iterator
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,10,7,6));
		
		ListIterator<Integer> it1=list.listIterator();
		
		while (it1.hasNext())
		{
			Integer y=it1.next();
			if(y==10)
			{
				it1.add(11);
			}
			if(y==1)
			{
				it1.set(0);
				
			}
			if(y==6)
			{
				it1.remove();
				
			}
			
		}
		while(it1.hasNext())
		{
	       System.out.println(it1.nextIndex());	
	       it1.next();
		}
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
			
		}
		System.out.println(list);
		
		//Descending Iterator
		
		TreeSet<Integer> treeset=new TreeSet<>();
		treeset.add(1);
		treeset.add(2);
		treeset.add(3);
		Iterator<Integer> its=treeset.descendingIterator();
		
	   System.out.println(treeset);
	   while(its.hasNext())
	   {
		   System.out.println(its.next());
		   
	   }
	 
	   
		TreeMap<Integer,String> tree= new TreeMap<>();
		tree.put(1,"A");
		Iterator<Integer> it2=tree.iterator();
		
		while(it2.hasNext())
		{
		// System.out.println(it2.next());
		Integer S= it2.next();
		if(S==2)
		{
			
			it2.remove();
		}
		 
		}
		System.out.println(tree);
		
		
		
		
		Collection<String>C= tree.values();
		Iterator<Integer> it3=s.iterator();
		while(it3.hasNext())
		{
			Integer A= it3.next();
			if(A==1)
			{
				
				it3.remove();
			}	
			
		}
		System.out.println(tree);
		
		Set<Map.Entry<Integer,String>> set=tree.entrySet();
		Iterator<Entry<Integer, String>> it4=set.iterator();
		
		while(it4.hasNext())
		{
			System.out.println( it4.next());
		}
		
		

	}

}


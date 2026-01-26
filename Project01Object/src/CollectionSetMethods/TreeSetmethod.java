package CollectionSetMethods;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetmethod {

	public static void main(String[] args) {
		Comparator<Integer> costum = new Comparator<Integer>()
				{

					@Override
					public int compare(Integer o1, Integer o2)
					{
						if(o1<o2)
						{
							return 1;
						}
						else if (o1>o2)
						{
						return -1;
						}
						
						
						return 0;
					}
			
				
				};
		
		
		
		TreeSet<Integer> tree = new TreeSet<>();
	    tree.add(12);
	    tree.add(13);
	    tree.add(1);
	    tree.add(2);
	    System.out.println(tree);
	    System.out.println(tree.ceiling(13));//searching(>=)
	    System.out.println(tree.headSet(13));//given value to head
	    System.out.println(tree.tailSet(2));//given value to tail
	    System.out.println(tree.first());//return first value
	    System.out.println(tree.last());//return last value
	    System.out.println(tree.lower(2));//return lesstha value without given value
	    System.out.println(tree.higher(2));//return greatertha value without given value
	    //System.out.println(tree.);
        System.out.println(tree.floor(3));//(<=)
        System.out.println(tree.subSet(2,13));//2,12
        
	}

}

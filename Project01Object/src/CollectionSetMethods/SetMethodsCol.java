package CollectionSetMethods;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetMethodsCol {

	public static void main(String[] args) {
		//Set Methods
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(13);
		set.add(12);
		set.add(null);
		//System.out.println(set.add(12));
	    //System.out.println(set.add(12));
        System.out.println(set);
        System.out.println(set.addAll(set));//return boolean value 
        System.out.println(set.remove(12));
        System.out.println(set);
        System.out.println(set.contains(13));//return boolean value
       // set.clear();
        //System.out.println(set);
        System.out.println(set.isEmpty());
       // Object ar=set.toArray();
       // System.out.println(Arrays.toString(ar));
       System.out.println(set.size());
       
       
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(11);
       
       HashSet<Integer> set1 = new HashSet<>(arr);
       set1.add(12);
	   set1.add(13);
	   set1.add(12);
	   set1.add(null);
	   System.out.println(set1);
       System.out.println(set1.clone());
       
       
       
       
       
	}
	

}

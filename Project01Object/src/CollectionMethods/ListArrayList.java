package CollectionMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(null);
        
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains(5));
        
        Object[] ar = arr.toArray();
        System.out.println(Arrays.toString(ar));
        
        
        Integer[] inarr= new Integer[arr.size()];
        arr.toArray(inarr);
        System.out.println(Arrays.toString(inarr));
        
        arr.add(6);
        System.out.println(arr);
      
        arr.addAll(arr);
        System.out.println(arr);
        
        arr.remove(2);//list index
        System.out.println(arr);
        
        //arr.remove(inarr);
        //System.out.println("remove object: "+arr);
        
       // arr.clear();
       // System.out.println(arr);
        
        arr.add(1,15);
        System.out.println(arr);
        
        arr.get(4);
        System.out.println(arr);
        
       
        
      
       /* ArrayList<Integer> arr1 = new ArrayList<>(arr);
        arr1.add(12);
        System.out.println(arr1);
        
        arr1.removeAll(arr);
        System.out.println(arr1);*/
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        System.out.println("orinal Array: "+arr2);
        
        ArrayList<Integer> arr3 = new ArrayList<>();//constract copy
        //System.out.println("After constractor copy Array: "+arr3);
        
        /*for(int i=0;i<arr3.size();i++)
        {
        	System.out.println("for loop copy arraylist: "+arr3);
        	
        }*/
        
        //ArrayList<Integer> arr4 = (ArrayList<Integer>)arr2.clone();
        //System.out.println("Clone use copy the value: "+arr4);
        
        ArrayList<Integer> arr4=arr2;
        System.out.println("shalow to copy arraylist: "+arr4);
        
        System.out.println(arr4);
        System.out.println("remove value: "+arr4.remove(Integer.valueOf(2)));//remove value return Boolean ---collection Method 
        System.out.println(arr4);
	}

}





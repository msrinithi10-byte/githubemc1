package CollectionMethods;

import java.util.ArrayDeque;
//import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Stack;
//import java.util.Vector;

public class DequeMethods {
	
	public static void main(String args[])
	{
		Deque<Integer> arr = new ArrayDeque<>();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(14);
		System.out.println(arr);
		
		arr.addFirst(1);
		arr.addLast(7);
		System.out.println(arr);
		
		/*arr.remove();//remove first value
		System.out.println(arr);
		arr.removeFirst();
		System.out.println(arr);
		arr.removeLast();
		System.out.println(arr);*/
		
		arr.pollFirst();
		System.out.println(arr);
		arr.pollLast();
		System.out.println(arr);
		
		System.out.println(arr.peek());
		System.out.println(arr.peekFirst());
		System.out.println(arr.peekLast());		

		
		Deque<Integer> arr1 = new LinkedList<>();
		arr1.add(1);
		arr1.add(3);
		arr1.add(5);
		System.out.println(arr1);
	     
		arr1.addFirst(null);
		arr1.addLast(12);
		System.out.println(arr1);
		
		
	}
	
	

}

package CollectionMethods;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePritorityQueueMethod {
	
	public static void main(String args[])
	{
		Queue<Integer> obj=new PriorityQueue<Integer>();
		obj.add(17);
		obj.add(20);
		obj.add(25);
		obj.add(6);
		obj.add(7);
		obj.add(1);
		obj.offer(12);
	    System.out.println(obj);
	    obj.remove();
	    System.out.println(obj);
	    obj.poll();
	    System.out.println(obj);
	    
	    System.out.println(obj.peek());
	   
	    Queue<Character> obj1=new PriorityQueue<>();
	    obj1.add('D');
	    obj1.add('A');
	    obj1.add('C');
	    obj1.add('f');
	    obj1.add('E');
	    System.out.println(obj1);
	   // obj1.remove();
	    System.out.println(obj1.peek());
	    obj1.remove();

	    System.out.println(obj1.peek());
	   
	}

}

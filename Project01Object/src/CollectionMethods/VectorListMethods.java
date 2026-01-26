package CollectionMethods;

import java.util.Vector;

public class VectorListMethods {

	public static void main(String args[])
	{
		Vector<Integer> vec = new Vector<>();
		/*vec.add(12);
		vec.addElement(13);
		System.out.println(vec);
		//vec.remove(0);
		//vec.removeElement(13);
		//vec.removeElementAt(0);
		//vec.removeAllElements();
	     System.out.println(vec);
	     System.out.println(vec.elementAt(0));//getElement based on index value
		//System.out.println(vec.firstElement());
	     //System.out.println(vec.lastElement());
	     vec.insertElementAt(14, 1);
	     System.out.println(vec);
		 System.out.println(vec.elementAt(0));
		 vec.setElementAt(12, 2);
		 System.out.println(vec);
		 System.out.println(vec.capacity());*/
	 
		
		vec.add(12);
		vec.add(13);
		vec.add(14);
		vec.add(15);
		vec.add(16);
		vec.add(17);
		vec.add(18);
		vec.add(13);
		vec.add(13);
		vec.add(13);
		System.out.println(vec.capacity());
		vec.add(13);
		vec.add(13);
		System.out.println(vec.capacity());
		vec.trimToSize();
		System.out.println(vec.capacity());
		vec.ensureCapacity(30);
		System.out.println(vec.capacity());
		
	}
}

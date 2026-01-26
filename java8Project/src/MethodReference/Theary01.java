package MethodReference;

import java.util.Arrays;
import java.util.List;

interface Text
{
public int max(int a,int b);

public default int macMultiple(int a,int b)
{
	return (a >=b)?a*2:b*2;
	
	
}
}

public class Theary01 {
	

	public static void main(String args[])
	{
	
	//exisiting method implementations(Application iruku)
			//::
			//Static method - className::MethodName
	        // Instance Method- Objname::MethodName
	
	
    Text text=Integer::max;
    System.out.println(text.max(2, 4));
     
    List<Integer> list = Arrays.asList(2,3,455,66,4);
    list.forEach(System.out::println);
    
   
	}
}

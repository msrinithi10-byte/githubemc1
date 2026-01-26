package StreamAIP;

import java.util.Arrays;

public class ArraysUsingStream {
	public static void main(String args[])
	{
	
		
		int[] arr= {1,2,3,4,5,6,7};
		
		Arrays.stream(arr)
		.boxed() //Convert primitive to non-primitive
		.forEach(System.out::println);
		
		Integer[] arrr= {7,6,5,4,3,2,1};
		Arrays.stream(arrr)
		.forEach(System.out::println);
		
	     String [] arr1 = {"one","two","three","four","five"};
	     
	     
	     Arrays.stream(arr1).flatMap((x)->Arrays.stream(x.split("")))
	     
	     .forEach(System.out::println);
		
		
		
	}

}

package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Function;

public class ArbitraryMethod {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("hello","hi","Sample","data"));
		Collections.sort(arr,String::compareToIgnoreCase);
		System.out.println(arr);
		
		Function<String,Integer> obj =new Function<>()
				{

					@Override
					public Integer apply(String t) {
						
						return t.length();
					}
			
			
				};
		
		
		
	}

}




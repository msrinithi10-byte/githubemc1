package StreamAIP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDimensionNested {
	public static void main(String args[])
	{
		ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> obj=new ArrayList<>(List.of(6,7,8,9,10));
		
		ArrayList<ArrayList<Integer>> list= new ArrayList<>();
		list.add(arr);
		list.add(obj);
		
		System.out.println(list);
		
		list.stream()
		.flatMap((x)->x.stream())
		.forEach(System.out::println);
		
		/*String[] s= {"one","two","three"};
		Arrays.stream(s)
		.filter((x)->x.length()=)
		//.flatMap((x)->Arrays.stream(x.split(" ")))
		.forEach(System.out::println);*/
		
	}

}

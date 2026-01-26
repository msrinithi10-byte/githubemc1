package CollectionutilityMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,4,1,6,9,4,3));
		Collections.sort(arr);
		System.out.println(arr);
		
		System.out.println(Collections.binarySearch(arr,4));
		System.out.println(Collections.min(arr));
		System.out.println(Collections.max(arr));
		System.out.println(Collections.frequency(arr, 4));
		
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(33,455,8,7));
		System.out.println(Collections.disjoint(arr, arr1));
		
		Collections.reverse(arr);
		System.out.println(arr);
		
		Collections.shuffle(arr);
		System.out.println(arr);
		
		//Collections.fill(arr, 0);
		//System.out.println(arr);
		
		System.out.println(Collections.unmodifiableList(arr));
		
		System.out.println(Collections.synchronizedList(arr));
		
		System.out.println(Collections.emptyList());
		
		
		System.out.println(Collections.singleton(14));
		System.out.println(Collections.singletonList(12));
		
		
	}

}

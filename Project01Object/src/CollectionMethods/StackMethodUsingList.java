package CollectionMethods;

import java.util.Stack;

public class StackMethodUsingList {

	public static void main(String[] args) {
		Stack<Integer> arr = new Stack<>();
		arr.push(12);
		arr.push(13);
		arr.push(14);
		arr.push(15);
		
		System.out.println(arr);
		System.out.println(arr.pop());
		System.out.println(arr);
		System.out.println(arr.peek());
		System.out.println(arr);

	}

}

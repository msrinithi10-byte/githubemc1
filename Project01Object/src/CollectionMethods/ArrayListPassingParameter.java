package CollectionMethods;
import java.util.ArrayList;

class A
{
	
}

class B extends A
{

}


public class ArrayListPassingParameter {
	
	public static void Method1(ArrayList<Integer> arr)
	{
		arr.add(6);
		System.out.println("The method is run");
	}

	public static void Method2(ArrayList<?>arr1)
	{
		
		System.out.println("method2");
	}
    
	public static void Sorting(ArrayList<Integer>arr)
	{
	for (int i=0;i<arr.size();i++)
	{
		for(int j=i+1;j<arr.size();j++)
		{
			if(arr.get(i)>arr.get(j))
			{
				int temp=arr.get(i);
				arr.set(i,arr.get(j));
				arr.set(j,temp);
				}
			
		}
		
	}
		
	}
     	

	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(5);
		arr.add(2);
		arr.add(4);
		arr.add(3);
		
		System.out.println(arr);
		Method1(arr);
		System.out.println(arr);
		
		ArrayList<Float> arr1 = new ArrayList<>();
		arr1.add(1.2F);
		System.out.println(arr1);
		Method2(arr1);
		
		System.out.println("before soting: "+arr);
		Sorting(arr);
		System.out.println("after sorting: "+arr);
		
}


	

}

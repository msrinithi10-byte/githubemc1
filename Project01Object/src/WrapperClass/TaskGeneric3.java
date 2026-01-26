package WrapperClass;

class ArrayaUsing<T extends Number>
{
	T[] t;
	
	public Integer finalTotal(T[]t)
	{
		int total = 0;
		for( T i : t)
		{
		total+=i.intValue();	
			
		}
		return total;
	}
}
public class TaskGeneric3 {
 
	public static void main(String[] args) 
	{
	    Integer[] arr= new Integer[] {1,2,3,4,5,6,7,8,9,10};
		ArrayaUsing<Integer> obj = new ArrayaUsing<>();
		 Integer res=obj.finalTotal(arr);
		System.out.println("Array addition :"+res);
		
	}

}

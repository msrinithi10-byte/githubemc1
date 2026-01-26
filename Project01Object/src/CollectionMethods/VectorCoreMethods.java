package CollectionMethods;

import java.util.Vector;

class Task implements Runnable
{
	Vector<Integer> arr;
	public Task(Vector<Integer> arr)
	{
		this.arr = arr;
	}
	@Override
	public void run() 
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
		System.out.println("Sorted...");
		
	}
	
}

class Task1 implements Runnable
{
	Vector<Integer> arr;
	public Task1(Vector<Integer> arr)
	{
		this.arr = arr;
	}
	@Override
	public void run() 
	{
		
		System.out.println(arr);
		
	}
	
}



public class VectorCoreMethods
{

	public static void main(String[] args) 
	{
		Vector<Integer> arr = new Vector<>();
		arr.add(23);
		arr.add(44);
		arr.add(33);
		arr.add(98);
		arr.add(78);
		
		Task th1 = new Task(arr);
		Task1 th2 = new Task1(arr);
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
		
	}

}

package ThreadProcesser;

class Resource
{
 public synchronized void  Number()
 {
 // int count=0;
  for(int i=1;i<=5;i++)
  {
  //count++;  
  System.out.println(Thread.currentThread().getName() +"-"+i);
  }
 }
}

class Once implements Runnable
{
	Resource resource;
	Once(Resource resource)
	{
	this.resource = resource;	
	}
	
	public void run()
	{
	resource.Number();
	}
}


class Twice implements Runnable
{
	Resource resource;
	Twice(Resource resource)
	{
	this.resource = resource;	
	}
	
	public void run()
	{
	resource.Number();
	}

}

public class SynchronizatoinThread {

	public static void main(String[] args) throws InterruptedException
	{
	
		Resource R = new Resource();
		
		Once  T1 = new Once(R);
		Twice T2 = new Twice(R);
		
		Thread T11 = new Thread(T1);
		Thread T22 = new Thread(T2);
		
		T11.start();
		T22.start();
		
		T11.join();
		T22.join();

	}

}

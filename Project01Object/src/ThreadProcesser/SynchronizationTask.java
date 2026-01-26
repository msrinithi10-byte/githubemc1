package ThreadProcesser;

class Resource1
{
synchronized void PrintTable(int x)
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"X"+x+"="+i*x);
}
}
}

class Table1 implements Runnable
{ 
	Resource1 resource;
	Table1(Resource1 resource)
	{
		this.resource=resource;
	}

	@Override
	public void run() {
		resource.PrintTable(2);
		
	}
	
}

class Table2 implements Runnable
{ 
	Resource1 resource;
	Table2(Resource1 resource)
	{
		this.resource=resource;
	}

	@Override
	public void run() {
		resource.PrintTable(7);
		
	}
	
}


public class SynchronizationTask {

	public static void main(String[] args) throws InterruptedException {
		Resource1 R = new Resource1();
		
		Table1 T1 = new Table1(R);
		Table2 T2 = new Table2(R);
		
		Thread T11 = new Thread(T1);
		Thread T22 = new Thread(T2);
		
		T11.start();
		T22.start();
		
		T11.join();
		T22.join();

	}

}

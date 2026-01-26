package ThreadProcesser;

class Thread1 implements Runnable
{

	@Override
	public void run() 
	{
		
		for(int i=1;i<=5;i++)
		{
			//System.out.println(i);
			System.out.println(Thread.currentThread().getName() +"--"+Thread.currentThread().isAlive());
			Thread.yield();
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public static void setPriority(int maxPriority) {
		// TODO Auto-generated method stub
		
	}
}
class Thread2 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			//System.out.println(i);
			System.out.println(Thread.currentThread().getName() +"--"+Thread.currentThread().isAlive());		
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		
	}

	
	
}


public class LifeCycleThread {
	public static void main(String args[]) throws InterruptedException
	{
		Thread1 T1 = new Thread1();
		Thread T11 = new Thread(T1);
	   T11.setName("Sugu");
		/*System.out.println(T11.getState());
		//System.out.println(T11.getState());
		T11.start();
		//System.out.println(T11.getState());
		T11.join();
		System.out.println(T11.getState());*/
		
		System.out.println(T11.isAlive());
		T11.start();
		//T11.join();
		//T11.setPriority(Thread.MIN_PRIORITY);
		System.out.println(T11.getPriority());
		System.out.println(T11.isAlive());
		
		Thread2 T2 = new Thread2();
		Thread T22 = new Thread(T2);
		T22.start();
		//T22.setPriority(Thread.MAX_PRIORITY);
		System.out.println(T22.getPriority());
		
	}
	

}

package ThreadProcesser;


   
class Thread3 implements Runnable
{
   
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("one");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
	}
	
}

class Thread4 implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("two");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
	}
	
}

class Thread5 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		}
	}
	
}



public class Task3 {
	public static void main(String args[]) throws InterruptedException
	{
		/*Thread3 T3 = new Thread3();
		Thread4 T4 = new Thread4();
		
		Thread t3 = new Thread(T3);
		Thread t4 = new Thread(T4);
		
		t3.start();
		t3.getPriority();
		t4.start();
	
		t3.join();
		Thread5 T5 = new Thread5();
		Thread t5 = new Thread(T5);
		t5.start();
		t5.join();
		
		System.out.println(Thread.currentThread().getName());*/
		
		Runnable R1 = new Runnable()
				{

					@Override
					public void run() {
						for(int i=1;i<=5;i++)
						{
							System.out.println("nila");
						}
						
					}
			
			
				};
				Thread T = new Thread(R1);
				T.start();
				T.join();
				
		Thread thread = new Thread()
		{
			@Override
			public void run() {
				for(int i=1;i<=5;i++)
				{
					System.out.println("swetha");
				}
				
			}	
			
		};
		
		thread.start();
		

		
				
	}

}

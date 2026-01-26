package ThreadProcesser;

 class ThreadTask
{
     public void printTable(int x)
     {
    	 for(int i=1;i<=10;i++)
    	 {
    		 System.out.println(i+"X"+x+"="+i*x+"--"+Thread.currentThread().getName());
    		 
    	 }
     }
}
     
    class Thread01 implements Runnable
    {
    	ThreadTask task1;
    	public Thread01(ThreadTask task1)
    	{
    		this.task1=task1;
    	}

		@Override
		public void run() 
		{
		task1.printTable(3);	
			
		}
    	
    }
	
 public   class Task
 {
	public static void main(String[] args) 
	{
		ThreadTask t1 = new ThreadTask();
		Thread01 Thed = new Thread01(t1);
		Thread thread = new Thread(Thed);
		thread.start();

		Thread thread1 = new Thread(Thed);
		thread1.start();
		
	}

}

package ThreadProcesser;

class Task01
{
	 public void printTable(int x)
     {
    	 for(int i=1;i<=10;i++)
    	 {
    		 System.out.println(i+"X"+x+"="+i*x+"--"+Thread.currentThread().getName());
    		 
    	 }
     }	
}

class Thread001 implements Runnable
{
    Task01 task1;
    Thread001(Task01 task1)
    {
    this.task1=task1;	
    }
    
	@Override
	public void run() {
		task1.printTable(2);
		
	}
	
}

class Thread002 implements Runnable
{

	Task01 task1;
	Thread002(Task01 task1)
	{
		this.task1=task1;
	}
	
	
	@Override
	public void run() {
		task1.printTable(7);
		
	}
	
}

public class Task2 {

	public static void main(String[] args) {
		Task01 t1 = new Task01();
		Thread001 thed1 = new Thread001(t1);
		Thread002 thed2 = new Thread002(t1);
		
		Thread Th1 = new Thread(thed1);		
		Thread Th2 = new Thread(thed2);
		
		Th1.start();
		Th2.start();

	}

}

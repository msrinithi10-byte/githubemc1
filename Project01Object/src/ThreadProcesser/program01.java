package ThreadProcesser;

public class program01 implements Runnable
{

/*public class program01 extends Thread
{
   void display()
   {
	   System.out.println("hello1 "+Thread.currentThread().getName());
	   System.out.println("hello2 "+Thread.currentThread().getName());
	   System.out.println("hello3 "+Thread.currentThread().getName());
	   System.out.println("hello4 "+Thread.currentThread().getName());
	   System.out.println("hello5 "+Thread.currentThread().getName());
   }
   @Override
   public void run()
   {
	this.display();   
   }*/
	
	void display()
	   {
		   System.out.println("hello1 "+Thread.currentThread().getName());
		   System.out.println("hello2 "+Thread.currentThread().getName());
		   System.out.println("hello3 "+Thread.currentThread().getName());
		   System.out.println("hello4 "+Thread.currentThread().getName());
		   System.out.println("hello5 "+Thread.currentThread().getName());
	   }
	
	@Override
	public void run() {
		this.display();
		
	}

  
	
	public static void main(String[] args) {
		
		/*program01 obj = new program01();
		obj.start();
		obj.display();*/
		
		program01 obj1 = new program01();
		Thread T1 = new Thread(obj1);
		T1.start();
		
		Thread T2 = new Thread(obj1);
		T2.start();
		
	}




	
}

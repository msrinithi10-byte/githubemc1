package ThreadProcesser;

class InstanceBlock
{
    //static block
	static {
		System.out.println("this is static block");
	}
	
	//instance block
	{
	System.out.println("this is instance block");	
	}
	
	InstanceBlock()
	{
		System.out.println("thic is construtor");
	}
	
	
}

class Type
{
    //synchronized block
	public  void add() throws InterruptedException
	{
		synchronized(this)
		{
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"Type1");
			System.out.println(Thread.currentThread().getName()+"Type2");
		}
		System.out.println(Thread.currentThread().getName()+"Type3");
		System.out.println(Thread.currentThread().getName()+"Type4");
		System.out.println(Thread.currentThread().getName()+"Type5");
	}
}

class Th1 implements Runnable
{
    Type type;
    Th1(Type type)
    {
    	this.type=type;
    }
	@Override
	public void run() {
		try {
			type.add();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}


class Type1
{
    //non static synchronized
	public synchronized void add() throws InterruptedException
	{
		
			System.out.println(Thread.currentThread().getName()+"Type1");
			System.out.println(Thread.currentThread().getName()+"Type2");
			System.out.println(Thread.currentThread().getName()+"Type3");
		    System.out.println(Thread.currentThread().getName()+"Type4");
		    System.out.println(Thread.currentThread().getName()+"Type5");
	}
}

class Th2 implements Runnable
{
    Type1 type1;
    Th2(Type1 type1)
    {
    	this.type1=type1;
    }
	@Override
	public void run() {
		try {
			type1.add();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}


class Type3
{
    //static synchronized
	public static synchronized void add() throws InterruptedException
	{
		
			System.out.println(Thread.currentThread().getName()+"Type1");
			System.out.println(Thread.currentThread().getName()+"Type2");
			System.out.println(Thread.currentThread().getName()+"Type3");
		    System.out.println(Thread.currentThread().getName()+"Type4");
		    System.out.println(Thread.currentThread().getName()+"Type5");
	}
}

class Th3 implements Runnable
{
    
	@Override
	public void run() {
		try {
			Type3.add();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}


public class SynchronizedTypeWithThread {
	public static void main(String[] args) {
		//Type of block
		//InstanceBlock IB = new InstanceBlock();
		
		//synchronized block
		/*Type Ty = new Type();
		
		Th1 th1 = new Th1(Ty);
		Th1 th2 = new Th1(Ty);
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();*/

		//non-static synchronized
		/*Type1 Ty1 = new Type1();
		
		Th2 th3 = new Th2(Ty1);
		Th2 th4= new Th2(Ty1);
		
		Thread t3 = new Thread(th3);
		Thread t4 = new Thread(th4);
		t3.start();
		t4.start();*/
		
		Th3 th5 = new Th3();
		Th3 th6= new Th3();
		
		Thread t5 = new Thread(th5);
		Thread t6 = new Thread(th6);
		t5.start();
		t6.start();
		
	}

}

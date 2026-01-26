package ThreadProcesser;

class Train
{
 public int seat=5;
 
 //non static synchronized
 public synchronized void BookSeat(int seatcount) throws InterruptedException
 {
	 System.out.println(Thread.currentThread().getName() +" before booking-"+seat);
	 System.out.println(Thread.currentThread().getName() +" processing...");
	if(seat == 0)
	{
		System.out.println(Thread.currentThread().getName() +"is Waiting..............");
		wait();
	}
	 
  if(seat >= seatcount)
  {
	  seat-=seatcount;
	System.out.println(Thread.currentThread().getName()+" your ticket is booked Successfully...");
   
  }
  else
  {
	System.out.println(Thread.currentThread().getName()+" seat is not available.."); 
  }
 
 }
 
 public synchronized void CanceBook(int seatcount)
 {
 	System.out.println(Thread.currentThread().getName()+"cancelbooking.......");
 	seat+=seatcount;
 	notifyAll();
 }
 
 void display()
 {
	 System.out.println(Thread.currentThread().getName()+" Available set - "+seat); 
 }

}



class Person implements Runnable
{   
	Train train;
	int seatcount;
	boolean CanceBook;
	Person(Train train,int seatcount,boolean CanceBook)
	{
		this.train=train;
		this.seatcount=seatcount;
		this.CanceBook=CanceBook;
	}

	@Override
	public void run() {
		
		if(CanceBook)
		{
			try {
				train.BookSeat(seatcount);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			train.CanceBook(seatcount);
		}
		
		else
		{
		try {	
			train.BookSeat(seatcount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}
	
}

//static synchronized
class Train1{
	 public static int seat=7;
	 
	 public static synchronized void BookSeat(int seatcount) throws InterruptedException
{
	 System.out.println(Thread.currentThread().getName() +" before booking-"+seat);
	 System.out.println(Thread.currentThread().getName() +" processing...");
	 Thread.sleep(1000);
 if(seat >= seatcount)
 {
	  seat-=seatcount;
	System.out.println(Thread.currentThread().getName()+" your ticket is booked Successfully...");
 }
 else
 {
	System.out.println(Thread.currentThread().getName()+" seat is not available.."); 
 }
}
}

class Person1 implements Runnable
{   
	int seatcount;
	public Person1(int i) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {	
			Train1.BookSeat(seatcount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

//Synchronized block
class Train2
{
	Integer seat=10;
public  void BookSeat(int seatcount) throws InterruptedException
{
	synchronized(this)
	{
		
	 System.out.println(Thread.currentThread().getName() +" before booking-"+seat);
	 System.out.println(Thread.currentThread().getName() +" processing...");
	 //Thread.sleep(1000);
	
 if(seat >= seatcount)
 {
	  seat-=seatcount;
	System.out.println(Thread.currentThread().getName()+" your ticket is booked Successfully...");
	
 }
 
 else
 {
	System.out.println(Thread.currentThread().getName()+" seat is not available.."); 
	
 }
	}
	
}

void display()
{
	 System.out.println(Thread.currentThread().getName()+" Available set - "+seat);
}
}

class Person2 implements Runnable
{   
	Train2 train;
	int seatcount;
	Person2(Train2 train,int seatcount)
	{
		this.train=train;
		this.seatcount=seatcount;
	}

	@Override
	public void run() {
		try {	
			train.BookSeat(seatcount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

public class TrainTaskWithThread {
	public static void main(String args[]) throws InterruptedException
	{
     //non-static synchronized
	Train T = new Train();
	Person P1 = new Person(T,5,true);
	Person P2 = new Person(T,2,false);
	Person P3 = new Person(T,2,false);
	
	
	Thread T1 = new Thread(P1);
	Thread T2 = new Thread(P2);
	Thread T3 = new Thread(P3);
	
	
	T1.start();
	T2.start();
	T3.start();
	
	T1.join();
	T2.join();
	T3.join();
	
	
	T.display();
		
	//static synchronized	
	/*Person1 P1 = new Person1(5);
	Person1 P2 = new Person1(2);
	Person1 P3 = new Person1(2);	
	
	Thread T1 = new Thread(P1);
	Thread T2 = new Thread(P2);
	Thread T3 = new Thread(P3);
	
	T1.start();
	T2.start();
	T3.start();*/
		
		//Synchronized block
		/*Train2 T = new Train2();
		Person2 P1 = new Person2(T, 5);
		Person2 P2 = new Person2(T, 2);
		Person2 P3 = new Person2(T, 2);
		
		Thread T1 = new Thread(P1);
		Thread T2 = new Thread(P2);
		Thread T3 = new Thread(P3);
		
		T1.start();
		T2.start();
		T3.start();*/
		
	}

}

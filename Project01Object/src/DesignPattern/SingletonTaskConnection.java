package DesignPattern;
 
class Thread01 implements Runnable
{
	User user;
	Thread01(User user)
	{
	this.user=user;	
	}
	
	@Override
	public void run() {
		
		
		DBconnection connection =DBconnection.getConnection();
		connection.save(user);
		
		System.out.println(Thread.currentThread().getName());
	}
	
	
	
}

class Thread02 implements Runnable
{
	User user;
	
	Thread02(User user)
	{
	this.user=user;	
	}

	@Override
	public void run() {
		DBconnection connection =DBconnection.getConnection();
		connection.save(user);
		
		System.out.println(Thread.currentThread().getName());
	}
	
}

class Thread03 implements Runnable
{
	User user;
	
	Thread03(User user)
	{
	this.user=user;	
	}

	@Override
	public void run() {
		DBconnection connection =DBconnection.getConnection();
		connection.save(user);
		
		System.out.println(Thread.currentThread().getName());

	}
	
}

class Thread04 implements Runnable
{
	User user;
	
	Thread04(User user)
	{
	this.user=user;	
	}
	
	@Override
	public void run() {
		DBconnection connection =DBconnection.getConnection();
		connection.save(user);
		System.out.println(Thread.currentThread().getName());

	}
	
}

public class SingletonTaskConnection {
          public static void main(String args[]) throws InterruptedException
          {
        	  User.UserBuilder userBuilder = new User.UserBuilder();
        	 User user = userBuilder.id(107).name("ravi").age(21).user();
              
        	  
        	Thread01 thread01 = new Thread01(user);
        	Thread02 thread02 = new Thread02(user);
        	Thread03 thread03 = new Thread03(user);
        	Thread04 thread04 = new Thread04(user);
        	
        	Thread thread1 = new Thread(thread01);
        	Thread thread2 = new Thread(thread02);
        	Thread thread3 = new Thread(thread03);
        	Thread thread4 = new Thread(thread04);
        	
        	thread1.start();
        	thread1.join();
        	
        	thread2.start();
        	thread2.join();
        	
        	thread3.start();
        	thread3.join();
        	
        	thread4.start();
        	thread4.join();
        	
        	  
          }
}

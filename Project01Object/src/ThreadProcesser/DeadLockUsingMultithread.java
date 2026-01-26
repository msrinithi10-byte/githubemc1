package ThreadProcesser;

class Resource01 
{
public synchronized void Add(Resource02 resource2)
{
System.out.println(Thread.currentThread().getName()+" add Method is Enter");
resource2.Sub(this);
}
}

class Resource02
{
public synchronized void Sub(Resource01 resource1)
{
System.out.println(Thread.currentThread().getName()+" sub Method is Enter");
resource1.Add(this);
}
}


class AddThread implements Runnable
{
    Resource01 resource1;
    Resource02 resource2;
    
    public  AddThread( Resource01 resource1,Resource02 resource2)
    {
    	this.resource1=resource1;
    	this.resource2=resource2;
    	
    }
    
    
	@Override
	public void run() {
		resource1.Add(resource2);
	}

	
}

class SubThread implements Runnable
{
	Resource01 resource1;
    Resource02 resource2;
    
    public  SubThread( Resource02 resource2,Resource01 resource1)
    {
    	this.resource2=resource2;
    	this.resource1=resource1;
    }
    
    
	@Override
	public void run() {
		resource2.Sub(resource1);
	}

	
}

//Another way of dead lock -----------

class Resource03 
{
	
	Resource04 resource4;
	public void setResource3(Resource04 resource4)
	{
	this.resource4=resource4;	
		
	}
public synchronized void Add()
{
System.out.println(Thread.currentThread().getName()+" add Method is Enter");
resource4.Sub();
}
}

class Resource04 
{
	Resource03 resource3;
	public void setResource4(Resource03 resource3)
	{
	this.resource3=resource3;	
		
	}
public synchronized void Sub()
{
System.out.println(Thread.currentThread().getName()+" add Method is Enter");
resource3.Add();
}
}

class AddThread1 implements Runnable
{
    Resource03 resource3;
    Resource04 resource4;
    
    public  AddThread1( Resource03 resource3,Resource04 resource4)
    {
    	this.resource3=resource3;
    	this.resource4=resource4;
    	
    }
    
    
	@Override
	public void run() {
		resource3.Add();
	}

	
}

class SubThread1 implements Runnable
{
	Resource04 resource4;
	Resource03 resource3;
    
    
    public  SubThread1( Resource04 resource4,Resource03 resource3)
    {
    	this.resource3=resource3;
    	this.resource4=resource4;
    }
    
    
	@Override
	public void run() {
		resource4.Sub();
	}

	
}


public class DeadLockUsingMultithread {

	public static void main(String[] args) {
		
		/*Resource01 R1 = new Resource01();
		Resource02 R2 = new Resource02();
		
		 AddThread addThread = new  AddThread(R1, R2);
		 SubThread subThread = new  SubThread(R2,R1);
		
		Thread T1 = new Thread(addThread);
		Thread T2 = new Thread(subThread);
		
		T1.start();
		T2.start();*/
		
		Resource03 R3 = new Resource03();
		Resource04 R4 = new Resource04();
		
		R3.setResource3(R4);
		R4.setResource4(R3);
		
		
		 AddThread1 addThread = new  AddThread1(R3, R4);
		 SubThread1 subThread = new  SubThread1(R4,R3);
		
		Thread T1 = new Thread(addThread);
		Thread T2 = new Thread(subThread);
		
		T1.start();
		T2.start();
		

	}

}

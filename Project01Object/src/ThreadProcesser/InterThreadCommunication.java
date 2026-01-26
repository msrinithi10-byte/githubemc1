package ThreadProcesser;



class PrintNumber
{
public synchronized void Print(String message) throws InterruptedException
{
for(int i=1;i<=10;i++)
{
System.out.println(Thread.currentThread().getName()+message);
notify();
wait();
}
notify();
}
}

class OneNumber implements Runnable
{
    PrintNumber printnumber;
    String message;
    OneNumber(PrintNumber printnumber,String message)
    {
    	this.printnumber=printnumber;
    	this.message=message;
    }
    
	
	@Override
	public void run() {
	   
	try {
		printnumber.Print(message);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	}



public class InterThreadCommunication {

	public static void main(String[] args) {
		
		PrintNumber pn = new PrintNumber();
		
		OneNumber On = new OneNumber(pn,"one");
		OneNumber On1 = new OneNumber(pn,"two");
		
		Thread t = new Thread(On);
		Thread t1 = new Thread(On1);
		
		t.start();
		t1.start();
				
		
		
	}

}

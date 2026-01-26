package ThreadProcesser;

class UserDefine implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"usermethod");
		}
		
	}
	
}

class SaveThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	while(true)
	{
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName()+"save");
	}
	}
	
}

public class DaemonLockThread {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		UserDefine user = new UserDefine();
		Thread T1 = new Thread(user);
		T1.start();
		
		SaveThread save = new SaveThread();
		Thread T = new Thread(save);
		
		T.setDaemon(true);
		T.start();
		
		/*for(int i=1;i<=10;i++)
		{
			System.out.println("Typing..............");
			Thread.sleep(500);
		}*/
		
		
	}

}

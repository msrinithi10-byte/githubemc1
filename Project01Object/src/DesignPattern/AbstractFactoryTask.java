package DesignPattern;

interface MessagingService
{
public void Message();
}

class Email implements MessagingService
{

	@Override
	public void Message() {
		System.out.println("messagingService send the message from -- Email");
		
	}
	
}

class SMS implements MessagingService
{

	@Override
	public void Message() {
		System.out.println("messagingService send the message from -- SMS");
		
	}
	
}

class Whatsapp implements MessagingService
{

	@Override
	public void Message() {
		System.out.println("messagingService send the message from -- Whatsapp");
		
	}
	
}

public class AbstractFactoryTask {
	public static void main(String args[])
	{
	 
		MessagingService messageservice = new SMS();
		messageservice.Message();
		
		System.out.println("we can use Abstract factory mathod");
		
	}
	

	

}

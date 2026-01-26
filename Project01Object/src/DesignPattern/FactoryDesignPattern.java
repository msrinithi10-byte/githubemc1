package DesignPattern;

interface MyNetwork
{
 
	void connectNetwork();
}

class jio implements  MyNetwork
{

	@Override
	public void connectNetwork() {
		System.out.println("jio network connected....");
	}
	
}

class Airtel implements  MyNetwork
{

	@Override
	public void connectNetwork() {
		System.out.println("Airtel network connected...");
		
	}
	
}

class Network
{
	private  MyNetwork network;
	
	public void switchNetwork(String service)
	{
		switch(service)
		{
		    case "jio":
			network = new jio();
			break;
			
		    case "Airtel":
		    	network = new Airtel();
		    	break;
		    	
		    	default:
		    		network= null;
		    		break;
		}
		
	}
	
	public MyNetwork getMyNetwork()
	{
		return network;	
	}
}


public class FactoryDesignPattern {

	public static void main(String[] args) {
		Network network = new Network();
		network.switchNetwork("Airtel");
		MyNetwork mynetwork =   network.getMyNetwork();
		mynetwork.connectNetwork();
		
		
	}

}

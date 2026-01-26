package DesignPattern;

class Dbconnection
{
private static Dbconnection connection=null;

Dbconnection()
{
System.out.println("Dbconnection constractor");	
}

public static  Dbconnection getInstance()
{
	if(connection == null)
	{
		connection = new  Dbconnection();
		
	}
	return connection;
	
}
}

public class SingletoDesignPattern {
	public static void main(String args[])
	{
		 Dbconnection obj1 =Dbconnection.getInstance();
		 
		
	}
	

}

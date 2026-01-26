package DesignPattern;

class DBconnections
{
private static Dbconnection connection= null;

private void DBconnection()
{
	System.out.println("DBconnection constractor");
}
	
public void save(User user)
{
System.out.println(user);
System.out.println("connection was saving...");	
}

public static Dbconnection getConnection()
{
 if(connection == null)
 {
	 connection = new  Dbconnection();
 }
 return  connection;
}

}

public class SingletonTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

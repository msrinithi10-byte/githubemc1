package Task01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionAccount {
	
	
	public static  Connection getConnection() throws SQLException 
	{
		String url ="jdbc:mysql://localhost:3306/ TaskWithJdbc";
		String username = "root";
		String password ="nithi7";
		
		return DriverManager.getConnection(url, username, password); 
		
	}

}

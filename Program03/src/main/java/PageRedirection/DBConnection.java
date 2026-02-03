package PageRedirection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Url ="jdbc:mysql://localhost:3306/PageDirection";
		String DBusername ="root";
		String DBpassword ="nithi7";
		
		return DriverManager.getConnection(Url,DBusername,DBpassword);
	}

}

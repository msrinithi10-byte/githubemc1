package MysqlConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Sample2 {
     
	public static Connection getConnection() throws SQLException
	{
		String url ="jdbc:mysql://localhost:3306/ connected";
		String username = "root";
		String password ="nithi7";
		
	    return DriverManager.getConnection(url, username, password);

        
	}
	
	public static void getTable() throws SQLException
	{
	  Connection con =	getConnection();
	  
	  CallableStatement cst=con.prepareCall("{call  showAll}");
	  
	  ResultSet res=cst.executeQuery();
	  
	  while(res.next())
	  {
	  System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getDouble(4));
	  }
	}
	 
	public static void get_Withid() throws SQLException
	{
		Connection con = getConnection();
		CallableStatement cst = con.prepareCall("{call get_id(?)}");
		cst.setInt(1,5);
		
		ResultSet res=cst.executeQuery();
		res.next();
		System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getDouble(4));
	}
	
	public static void get_inOut() throws SQLException
	{
		Connection con = getConnection();
		CallableStatement cst = con.prepareCall("{call get_idWithName(?,?)}");
		cst.setInt(1, 3);
		cst.registerOutParameter(2, Types.VARCHAR);
		
		cst.execute();
		System.out.println("name: "+cst.getString(2));
		
	}
	
	public static void getInOUT() throws SQLException
	{
		Connection con = getConnection();
		CallableStatement cst = con.prepareCall("{call  getInOut(?)}");
		cst.setString(1,"priya");
		cst.registerOutParameter(1, Types.VARCHAR);
		cst.execute();
		System.out.println("Location: "+cst.getString(1));
	}
	
	
	public static void main(String[] args) throws SQLException {
	        
		//getTable();
		//get_Withid();
		get_inOut();
		//getInOUT();
	}

}

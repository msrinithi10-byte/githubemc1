package Task02UsingManyToMany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManyToManyTask {
	
	public static  Connection getConnection() throws SQLException 
	{
		String url ="jdbc:mysql://localhost:3306/ ManyToManyTask";
		String username = "root";
		String password ="nithi7";
		
		return DriverManager.getConnection(url, username, password); 
		
	}
	
	public static void insert() throws SQLException
	{
		Connection con =getConnection();
		
		Statement std =con.createStatement();
		
	    String query = "insert into  Videos  (vid_title, likes, views) values('Fun Vlog',200,3000);";
		
		//System.out.println(query);
	   int row = std.executeUpdate(query);
	   System.out.println("row affected"+ row);
	    
	}
	
	public static void idToGetComment() throws SQLException
	{
		
		Connection con =getConnection();
		Statement std =con.createStatement();
		String query = "select c.comments from videos v inner join junctionTable j on v.vid_id = j.vid_id inner join comments c on c.com_id = j.com_id where v.vid_id = 1;";
		
		ResultSet res =std.executeQuery(query);
		
		while(res.next())
		{
			System.out.println(res.getString(1));
			
		}
	}
	
	public static void MaxViews() throws SQLException
	{
		Connection con =getConnection();
		Statement std=con.createStatement();
		String query = "Select max(v.views) from videos v inner join junctionTable j on v.vid_id = j.vid_id inner join comments c on c.com_id = j.com_id;";
		ResultSet res =std.executeQuery(query);
		res.next();
		System.out.println("highest views in videos: "+res.getInt(1));
	}
	
	public static void AddComments() throws SQLException
	{
		Connection con =getConnection();
		Statement std=con.createStatement();
		String query = "insert into junctionTable values(5,1)";
		int row=std.executeUpdate(query);
		System.out.println("add comment: "+row);
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		
		//insert();
	//	idToGetComment();
		//MaxViews();
		AddComments();
	
	}

}

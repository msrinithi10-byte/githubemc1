package PageRedirection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ValidateServer")
public class ValidateServlet extends HttpServlet
{
 
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String username1 = req.getParameter("username");
		
       try {
            Connection con = DBConnection.getConnection();
		    Statement std =con.createStatement();
		    
		    String query="Select*from UserTable";
		    ResultSet rst= std.executeQuery(query);
		    
		    while(rst.next())
		    {
		    	String dbuser =rst.getString("username"); //bd column name
		    	
		    	if(dbuser.equals(username1))
		    	{
		    		res.sendRedirect("validdata.html");
		    		
		    	}
		    	else
		    	{
		    		res.sendRedirect("InvalidData.html");
		    		
		    	}
		    }
		    
		   
		   
		    
       }catch(Exception e){
    		e.printStackTrace();
       }
		
	}
	
	
	
}

package Task2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Task.User;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SaveServlet extends HttpServlet
{ 
	public void doPost(HttpServletRequest req,HttpServletResponse res ) throws IOException
	{
		res.setContentType("text/html");		
		PrintWriter out=res.getWriter();
		

		 String usernamee = req.getParameter("username");
		 String age = req.getParameter("age");
		 String gender = req.getParameter("gender");
		 String email = req.getParameter("email");
		 
		
		ServletConfig config =super.getServletConfig();
		String url =config.getInitParameter("dbUrl");
		String dbusername =config.getInitParameter("dbUsername");
		String dbpassword =config.getInitParameter("dbPassword");
		
		
		/* try {
	            
	            Connection con = DbConnection.getConnection(url, dbusername, dbpassword);

	            
	            String sql =
	                "INSERT INTO uservalue (username, age, gender, email) VALUES (?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, usernamee);
	            ps.setString(2, age);
	            ps.setString(3, gender);
	            ps.setString(4, email);

	            int result = ps.executeUpdate();

	            if (result > 0) {
	                out.println("<h2>Data inserted successfully ✅</h2>");
	            } else {
	                out.println("<h2>Insert failed ❌</h2>");
	            }

	            ps.close();
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	            out.println("<h2>Error : " + e.getMessage() + "</h2>");
	        
	    }*/
		
		try {
			Connection con = DbConnection.getConnection(url, dbusername, dbpassword);
			
			Statement std =con.createStatement();
			
			String sql ="Insert INTO uservalue (username,age,gender,email) values ('"+usernamee+"','"+age+"','"+gender+"','"+email+"')";
			
			//System.out.println(sql);
			
			int res1=std.executeUpdate(sql);
			
			if(res1 > 0)
			{
				out.println("Insert data succesfully");
				
			}else 
			{
				out.println("insert failed");
				
			}
		
		}
		catch(Exception e){
			e.printStackTrace();
			out.println("error:"+e.getMessage());
			
		}
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/json");		
		PrintWriter out=res.getWriter();
		
		ServletConfig config =super.getServletConfig();
		String url =config.getInitParameter("dbUrl");
		String dbusername =config.getInitParameter("dbUsername");
		String dbpassword =config.getInitParameter("dbPassword");
		
		try {
			
            Connection con = DbConnection.getConnection(url, dbusername, dbpassword);
		    Statement std =con.createStatement();
		    
		    String query="Select*from uservalue";
		    ResultSet rst= std.executeQuery(query);
		  
		    StringBuilder jsonRes =new StringBuilder("Username:[");
	       
		  
		    	        
	        while(rst.next())
	        {
	        	
	        	jsonRes.append(String.format("{\"username\" : \"%s\",\"age\" :\"%s\" ,\"gender\":\"%s\",\"email\" :\"%s\"},"
	        			,rst.getString(1),
	        			rst.getString(2),
	        			rst.getString(3),
	        			rst.getString(4)));
	        	
	        	
	        }
	        
	        jsonRes.append("]");
	       
	        out.print(jsonRes.toString());
	      
		}catch(Exception e){
			e.printStackTrace();
			out.println("error:"+e.getMessage());
			
		}
		
		
		
		  
		}
		
		
	}



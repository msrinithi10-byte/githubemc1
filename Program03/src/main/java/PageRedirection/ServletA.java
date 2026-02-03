package PageRedirection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/A")
public class ServletA extends HttpServlet
{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		 String username1 = req.getParameter("username");
		 String age = req.getParameter("age");
		 String gender = req.getParameter("gender");
		 String email = req.getParameter("email");
		 
		
		 try {
	            
	            Connection con = DBConnection.getConnection();

	            System.out.println("Username: " + username1);
	    		System.out.println("Age: " + age);
	    		System.out.println("Gender: " + gender);
	    		System.out.println("Email: " + email);
	    		
	            
	            String sql ="INSERT INTO  UserTable (username, age, gender, email) VALUES (?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, username1);
	            ps.setString(2, age);
	            ps.setString(3, gender);
	            ps.setString(4, email);

	            int result = ps.executeUpdate();
	            
	            
	            req.getRequestDispatcher("HomePage.html").forward(req, res);

	        } catch (Exception e) {
	            e.printStackTrace();

	    }
		
		 
	}
}

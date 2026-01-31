package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class ValidateRegistration extends HttpServlet
{	
	 ArrayList<User> list = new ArrayList<>();
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
 {
	 
	 String username = req.getParameter("username");
	 String age = req.getParameter("age");
	 String gender = req.getParameter("gender");
	 String email = req.getParameter("email");
	 
	 User user = new User(username,age,gender,email);
	 
	 list.add(user);
	 PrintWriter out=res.getWriter();
	 out.print("add value");
	 
	 
	 }
 
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		
		StringBuilder jsonRes =new StringBuilder("employee:[");
     int last = list.size()-1;
     
     for(int i=0;i<list.size();i++)
     {
     	User use=list.get(i);
     	String line = String.format("{\"name\" : \"%s\",\"age\" :\"%s\" ,\"gender\":\"%s\",\"email\":\"%s\"}",use.getUsername(),use.getAge(),use.getGender(),use.getEmail());
     	
     	if(i == last)
     	{
     		jsonRes.append(line).append("]");
     		
     	}
     	else
     	{
     		jsonRes.append(line).append(",");
     		
     	}
     	
     }
     
     String response=jsonRes.toString();
     res.setContentType("Application/json");
     PrintWriter out=res.getWriter();
     out.println(response);
		
	}
	
 
 }
	
 
 
 


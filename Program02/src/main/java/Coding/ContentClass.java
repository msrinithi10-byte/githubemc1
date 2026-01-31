package Coding;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Content")
public class ContentClass extends HttpServlet
{
	/*public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1> hello world </h1>");
		
	}*/
	
	/*public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/plain");
		PrintWriter out=res.getWriter();
		out.println("<h1> hello world </h1>");
		
	}*/
	
	/*public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/json");
		PrintWriter out=res.getWriter();
		out.println("{ \"id\":101 ,\"name\":\"raja\",\"salary\":20000.00 }");
		
	}*/
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/XML");
		PrintWriter out=res.getWriter();
		out.println("<employee><id>101</id><name>raja</name><salary>30000.00</salary></employee>");
		
	}
	
	

}

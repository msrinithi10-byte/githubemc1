package Coding;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sayhello")
public class ServletLifeCycle extends HttpServlet
{
	public void init()
	{
		System.out.println("the servlet is initialized");
		
	}

	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.println("Service method is worked");
		System.out.println("Service method is worked");
		
	}
	
	public void destroy()
	{
		System.out.println("destroy the methods.....");
		
	}
	
	
}

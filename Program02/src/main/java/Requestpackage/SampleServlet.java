package Requestpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sayRequest")
public class SampleServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	
		/*BufferedReader bfr = req.getReader();
		int i;
		while((i=bfr.read()) != -1)
		{
			char ch =(char)i;
			System.out.print(ch);
			
		}*/
		
		/*res.setContentType("text/plain");
		BufferedReader bfr = req.getReader();
		PrintWriter out =res.getWriter();
		
		int i;
		while((i=bfr.read())!=-1)
		{
			char ch = (char)i;
			out.print(ch);
			
		}*/
		
		res.setContentType("text/plain");
		BufferedReader bfr = req.getReader();
		PrintWriter out =res.getWriter();
		
	    String line ;
	
	    
		while((line=bfr.readLine())!=null)
		{
			
			out.println(line);
			
		}
		
		
	}
	

}

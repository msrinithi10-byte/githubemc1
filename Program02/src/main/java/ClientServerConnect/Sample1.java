package ClientServerConnect;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Sample1 extends HttpServlet
{ 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		res.getWriter().println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <title>JavaServlet</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <form action=\"Validate\" method=\"get\">\r\n"
				+ "        <label for=\"username\">Username</label>\r\n"
				+ "        <input type=\"text\" name=\"username\" id=\"username\">\r\n"
				+ "        <label for=\"password\">Password</label>\r\n"
				+ "        <input type=\"text\" name=\"password\" id=\"password\">\r\n"
				+ "        <button type=\"submit\">submit</button>\r\n"
				+ "    </form>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "</html>");
		
	}

}

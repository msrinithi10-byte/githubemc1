package ClientServerConnect;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class samplevalidate extends HttpServlet
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
      String username= req.getParameter("username");
      String password= req.getParameter("password");
      System.out.println(username+" "+password);
	}

}

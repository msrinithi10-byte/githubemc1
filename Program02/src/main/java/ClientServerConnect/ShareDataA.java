package ClientServerConnect;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/A")
public class ShareDataA extends HttpServlet
{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		req.setAttribute("name","raja");
		req.setAttribute("password","raja1234");
		req.getRequestDispatcher("B").forward(req, res);
	}
}

package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Employee")
public class Task01Employee extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/XML");
		PrintWriter out = res.getWriter();
		
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new Employee (101,"raja",2000.00));
		arr.add(new Employee (102,"ram",2000.00));
		arr.add(new Employee (103,"ravi",2000.00));
		arr.add(new Employee (104,"aravind",2000.00));
		arr.add(new Employee (105,"kumar",2000.00));
		arr.add(new Employee (106,"susi",2000.00));
		arr.add(new Employee (107,"priya",2000.00));
		arr.add(new Employee (108,"jai",2000.00));
		
		out.println("<Employees>");
		for(Employee e:arr)
		{
			out.println("<Employee>");
			out.println("<id>"+e.getId()+"</id>");
			out.println("<name>"+e.getName()+"</name>");
			out.println("<salary>"+e.getSalary()+"</salary>");
			out.println("</Employee>");
			
		}
		out.println("</Employees>");
		
	}
}

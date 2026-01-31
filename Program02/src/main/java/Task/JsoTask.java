package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/JsonTak")
public class JsoTask  extends HttpServlet
{
	private ArrayList<Employee> arr = new ArrayList<>();
	public void list()
	{
		this. arr = new ArrayList<>(Arrays.asList(new Employee (101,"raja",2000.00),
				                                  new Employee (102,"ram",3000.00),
				                                  new Employee (103,"ravi",4000.00)
				                                  ));
		
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		list();
		
		StringBuilder jsonRes =new StringBuilder("employee:[");
        int last = arr.size()-1;
        
        for(int i=0;i<arr.size();i++)
        {
        	Employee emp=arr.get(i);
        	String line = String.format("{\"id\" : \"%d\",\"name\" :\"%s\" ,\"salary\":\"%f\"}",emp.getId(),emp.getName(),emp.getSalary());
        	
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

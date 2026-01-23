package MysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Student
{
int id;
String name;
String loc;
public Student(int id, String name, String loc) {
	super();
	this.id = id;
	this.name = name;
	this.loc = loc;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}

}




public class sample {
      
	public static Connection ConnectionSql() throws SQLException
	{
		String url ="jdbc:mysql://localhost:3306/ connected";
		String username = "root";
		String password ="nithi7";
		
	    return DriverManager.getConnection(url, username, password);

        
	}
	
	public static void SelectAll() throws SQLException
	{
		 Connection con= ConnectionSql();  
			
		  Statement std= con.createStatement();
		  
		  String query = "Select * from employee";
		  ResultSet rst=std.executeQuery(query);
		  
		  while(rst.next())
			  
		  {
		  System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getString(3)+" "+rst.getDouble(4));

		  }	
		
	}
	
	public static void insertion() throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query = "insert into Employee (name, dept,salary) values('susi','IT',20000.00)";
		 int row=std.executeUpdate(query);
		 System.out.println("row affected: "+row);
		
	}
	
	public static void insertparameter(String name,String dept, double salary) throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query = "insert into Employee (name, dept,salary) values ('"+name+"','"+dept+"',"+salary+");";
		//System.out.println(query); 
		int row=std.executeUpdate(query);
		 System.out.println("row affected: "+row);
	}
	
	public static void updation(String dept,String name) throws SQLException
	{
		Connection con = ConnectionSql();	
	  	Statement std =con.createStatement();
	  	//String query = "update Employee set dept='IT' where name = 'Susi'"; //without parameter
	  	String query = "update Employee set dept ='"+dept+"' where name = '"+name+"';";
	  	int row =std.executeUpdate(query);
	  	System.out.println("row affected: "+row);
	}
	
	public static void deletion() throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query = "delete from Employee where name = 'ram'";
		 int row=std.executeUpdate(query);
		 System.out.println("row affected: "+row);
		
	}
	
	public static void Create() throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query = "Create table sample(id int,name1 varchar(30));";
		 int row=std.executeUpdate(query);
		 System.out.println("row affected: "+row);
		
	}
	
	public static void droping() throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query = "alter table Employee drop salary;";
		 int row=std.executeUpdate(query);
		 System.out.println("row affected: "+row);
		
	}

	public static void batchprocess() throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query1 = "insert into sample values(1,'karuniya'),(2,'vennila'),(3,'swetha');";
		String query2= "delete from sample where id=1;";
		
		std.addBatch(query1);
		std.addBatch(query2);
		
	  int[]	arr= std.executeBatch();

	  for(int a :arr)
	  {
		  System.out.println("row affected: "+a);
	  }
	  
	}
	
     
	public static void sqlInjection() throws SQLException
	{
		Connection con = ConnectionSql();
		Statement std =con.createStatement();
		String query = "delete from sample where id=3 or 1=1;";
		 int row=std.executeUpdate(query);
		 System.out.println("row affected: "+row);
		
	}
	
	// prepare statement
	
	public static void insertwithPrepare(String name,String dept) throws SQLException
	{
		Connection con = ConnectionSql();
		String query ="insert into Employee ( name, dept) values (?,?)";
		PreparedStatement pst =con.prepareStatement(query);
		pst.setString(1, name);
		pst.setString(2,dept);
		
		 int row =pst.executeUpdate();
		System.out.println(row);
	}
	
	public static void updatewithPrepare(String name,String dept) throws SQLException
	{
		Connection con = ConnectionSql();
		String query ="update Employee set dept=? where  name = ?;";
		PreparedStatement pst =con.prepareStatement(query);
		pst.setString(1, dept);
		pst.setString(2,name);
		
		 int row =pst.executeUpdate();
		System.out.println(row+" row affected..");
	}
	
	public static void deletewithPrepare() throws SQLException
	{
	  Connection con=ConnectionSql();
	  String query = "delete from Employee where id = ? ;";
	  PreparedStatement pst =con.prepareStatement(query);
	  pst.setInt(1,1);
	  
	  int row = pst.executeUpdate();
	  System.out.println("row affected..."+row);
		
	}
	
	// using clear
	public static void insertWithClear() throws SQLException
	{
		Connection con =ConnectionSql(); 
		String query = "insert into employee(name,dept) values(?,?);";
		PreparedStatement pst=con.prepareStatement(query);
		
		pst.setString(1, "raja");
		pst.setString(2, "Mech");
		
		pst.execute();
		
		
		pst.clearParameters();
		pst.setString(1, "ravi");
		pst.setString(2, "Ai");
		
		pst.execute();
		System.out.println("insert successfully");
		
		
	}
	
	
	// using arrayList to insert the value -- Bulk method
	static  List<Student> stdList = new ArrayList<>();
	
	public static void addStd()
	{
	stdList.add(new Student(1,"abc","chennai"));
	stdList.add(new Student(2,"cd","chennai"));
	stdList.add(new Student(3,"ef","chennai"));
	stdList.add(new Student(4,"gh","chennai"));
	stdList.add(new Student(5,"ij","chennai"));
	stdList.add(new Student(6,"kl","chennai"));
	stdList.add(new Student(7,"mn","chennai"));
	}
	
	public static void bulkInsert() throws SQLException
	{
		 Connection con=ConnectionSql();
		 String query = "insert into sample1 values(?,?,?) ;";
		 PreparedStatement pst =con.prepareStatement(query);
		 
		 for(Student std:stdList)
		 {
			 pst.setInt(1,std.id);
			 pst.setString(2,std.name);
			 pst.setString(3,std.loc);
			 pst.addBatch();
		 }
		
		 int[] arr = pst.executeBatch();
		 for(int a:arr)
		 {
			 System.out.println("insert row succesfully........."+a);
			 
		 }
	}
	

	public static void main(String[] args) throws SQLException {
		  
		//SelectAll();
		//insertion();
	    
		//insertparameter("ram","CSC",30000.00);
		//updation("IT","ram");
		//deletion();
		//Create();
		//droping();
		//batchprocess();
		//sqlInjection();
		
		// prepared Statement
		//insertwithPrepare("saran","mech");
		//updatewithPrepare("John Doe","Finace");
		//deletewithPrepare();
		/*addStd();
		bulkInsert();*/
		
		insertWithClear();
	}

}

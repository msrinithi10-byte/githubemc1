package Task01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Transcation {

	public static void CreateAccontdetails() throws SQLException
	{
		Connection con=ConnectionAccount.getConnection();
		Statement std=con.createStatement();
		Account account = new Account();
	
		String query ="insert into AccountDetail(Acc_name,Acc_no,Acc_bal,Acc_phoneNo)values ('"+account.getAcc_name()+"',"+account.getAcc_no()+","+account.getAcc_bal()+","+account.getAcc_phoneNo()+");";
	
		int row=std.executeUpdate(query);
		System.out.println("row affected: "+row);
		
		con.close();
	}
	
	public static void Deposite() throws SQLException
	{
		//Connection con=null;
		//Statement std = null;
		
		try {
		Connection con=ConnectionAccount.getConnection();
		Statement std = con.createStatement();

		Scanner scan1 = new Scanner(System.in);
		System.out.println("sender account number :");
		long num1 = scan1.nextLong();
		
		System.out.println("receiver account number :");
		long num2 = scan1.nextLong();
		
		
		String query = "select * from  AccountDetail where Acc_no = " + num1;
		ResultSet res= std.executeQuery(query);
		res.next();
		
		System.out.println(res.getInt("Acc_id")+" "+res.getString("Acc_name")+" "+res.getInt("Acc_no")+" "+res.getInt("Acc_bal")+" "+res.getInt("Acc_phoneNo"));
		
		System.out.println("Send amount..");
	    int amount = scan1.nextInt();
	    
	    String query1 = "update AccountDetail set Acc_bal=Acc_bal-"+amount+" where Acc_no = "+num1;
	    String query2 = "update AccountDetail set Acc_bal=Acc_bal+"+amount+" where Acc_no = "+num2;
	    
	    std.addBatch(query1);
	    std.addBatch(query2);
	    
	    int[]	arr= std.executeBatch();
	    for(int a :arr)
		  {
			  System.out.println("row affected: "+a);
		  }
		}
		catch(SQLException e)
		{
			System.out.println("enter invalid Account number");
		}
		
	}
	
	public static void BalanceCheck() throws SQLException
	{
		
		Connection con=ConnectionAccount.getConnection();
		Statement std = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Account number:");
		long  Acc_no =scan.nextLong();
		
		String query = "Select Acc_bal from AccountDetail where Acc_no = "+Acc_no;
        
		ResultSet res=std.executeQuery(query);
		
	    res.next();
	    int value =res.getInt("Acc_bal");
		
		//System.out.println("Check Balance:"+value);
		
		if(value != 0)
		{
			System.out.println("Check Balance:"+value);
		}
		else {
	     System.out.println("there is no balance is the account");
			
		}
	}
	
	public static void WithDrawal() throws SQLException
	{
		Connection con=ConnectionAccount.getConnection();
		Statement std = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		Long Acc_no = scan.nextLong();
		
		System.out.println("Send amount..");
	    int amount = scan.nextInt();
		
		String query = "update AccountDetail set Acc_bal=Acc_bal-"+amount+" where Acc_no = "+Acc_no;
		
		int res=std.executeUpdate(query); 
		System.out.println("Withdraw the amount"+res);
		
	}
	

	public static void main(String[] args) throws SQLException {
		
		//CreateAccontdetails();
		//Deposite();
		
		//BalanceCheck();
		WithDrawal();
	}

}
 
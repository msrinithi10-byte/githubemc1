package Task01;

import java.util.Scanner;

public class Account {
     
	
    private String Acc_name; 
	private long Acc_no ;
	private int Acc_bal ;
	private long Acc_phoneNo ;
	
	public Account() {
		super();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Account Name: ");
		 Acc_name=scan.next();
		
		System.out.println("Enter Account number: ");
		 Acc_no=scan.nextInt();
		
		System.out.println("Enter Account balance: ");
		 Acc_bal=scan.nextInt();
		
		System.out.println("Enter Account phone no:");
		 Acc_phoneNo=scan.nextInt();
		
	}
	
	
	public String getAcc_name() {
		return Acc_name;
	}
	public void setAcc_name(String acc_name) {
		Acc_name = acc_name;
	}
	public long getAcc_no() {
		return Acc_no;
	}
	public void setAcc_no(long acc_no) {
		Acc_no = acc_no;
	}
	public int getAcc_bal() {
		return Acc_bal;
	}
	public void setAcc_bal(int acc_bal) {
		Acc_bal = acc_bal;
	}
	public long getAcc_phoneNo() {
		return Acc_phoneNo;
	}
	public void setAcc_phoneNo(long acc_phoneNo) {
		Acc_phoneNo = acc_phoneNo;
	}
	
	
	
	

}

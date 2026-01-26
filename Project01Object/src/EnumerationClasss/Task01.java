package EnumerationClasss;

import java.util.Arrays;
import java.util.Scanner;

enum Role
{
SUPER_ADMIN(Operations.READ,Operations.WRITE,Operations.UPDATE,Operations.DELETE),
ADMIN(Operations.READ,Operations.WRITE,Operations.UPDATE,Operations.DELETE),
MANAGER(Operations.READ,Operations.WRITE,Operations.UPDATE),
STAFF(Operations.READ,Operations.WRITE),
USER(Operations.READ);
	
	private Operations[] operations;

Role(Operations ...operations) {
	this.operations=operations;
}

public Operations[] getOperations()
{
	return this.operations;
	
}
}

enum Operations 
{
READ,
WRITE,
UPDATE,
DELETE;
}


public class Task01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the role:");
		String role=scan.nextLine();
		//String operations="admin";
		Role r=Role.valueOf(role.toUpperCase());
		switch(r)
		{
		case SUPER_ADMIN:
			System.out.println(Arrays.toString(Role.SUPER_ADMIN.getOperations()));
			break;
			
		case ADMIN:
			System.out.println(Arrays.toString(Role.ADMIN.getOperations()));
			break;
			
		case MANAGER:
			System.out.println(Arrays.toString(Role.MANAGER.getOperations()));
			break;
			
		case STAFF:
			System.out.println(Arrays.toString(Role.STAFF.getOperations()));
			break;
			
		case USER:
			System.out.println(Arrays.toString(Role.USER.getOperations()));
			break;
		}
	}

}

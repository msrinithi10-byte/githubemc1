package EnumerationClasss;

import java.util.Arrays;
import java.util.Scanner;

enum Roles
{
SUPER_ADMIN,
ADMIN,
MANAGER,
STAFF,
USER;
}

enum Prefromance
{
READ(Roles.SUPER_ADMIN,Roles.ADMIN,Roles.MANAGER,Roles.STAFF,Roles.USER),
WRITE(Roles.SUPER_ADMIN,Roles.ADMIN,Roles.MANAGER,Roles.STAFF,Roles.USER),
UPDATE(Roles.SUPER_ADMIN,Roles.ADMIN,Roles.MANAGER),
DELETE(Roles.SUPER_ADMIN,Roles.ADMIN);

private Roles[] roles;	
Prefromance(Roles ...roles) {
	this.roles=roles;
}
	
public Roles[] getRoles()
{
	return this.roles;
	
}
	
}



public class Task02 {
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the prefromance:");
		String prefromance=scan.next();
	//String prefromance="Read";
	Prefromance P= Prefromance.valueOf(prefromance.toUpperCase());
	
	switch(P)
	{
	case READ:
		System.out.println(Arrays.toString(Prefromance.READ.getRoles()));
		break;
		
	case WRITE:
		System.out.println(Arrays.toString(Prefromance.WRITE.getRoles()));
		break;
		
	case UPDATE:
		System.out.println(Arrays.toString(Prefromance.UPDATE.getRoles()));
		break;
		
	case DELETE:
		System.out.println(Arrays.toString(Prefromance.DELETE.getRoles()));
		break;
	
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

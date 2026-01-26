package DateAndTimeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employeee
{
String name;
String dept;
int joinDate;

Employeee(String name,String dept,int joinDate)
{
  this.name=name;
  this.dept=dept;
  this.joinDate=joinDate;	
}
}

public class Task03DateTime {

	public static void main(String[] args) {
		List<Employeee> list= new ArrayList<>();
		
		list.add(new Employeee("raja","testing",12));
		list.add(new Employeee("ravi","testing",13));
		list.add(new Employeee("ram","testiong",14));
		
		
		
		
		
	}

}

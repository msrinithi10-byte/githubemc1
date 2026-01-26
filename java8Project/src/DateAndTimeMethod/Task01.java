package DateAndTimeMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task01 {

	public static void main(String[] args) {
		int year=2008;
		
		for(int month=1;month<=12;month++)
		{
			 LocalDate date1=LocalDate.of(year, month,1);
			 System.out.println(date1.getMonth());
			
	      	int d=date1.lengthOfMonth();
	      	
	      	for(int date=1;date<=d;date++)
	      	{
	      		
	      		 LocalDate date2=LocalDate.of(year, month,date);
	      		 DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	      			System.out.println(date2.format(format));
	      	}
		}
	}

}  

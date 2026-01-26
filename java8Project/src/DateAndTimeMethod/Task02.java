package DateAndTimeMethod;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task02 {

	public static void main(String[] args) {
		int year=2025;
		for(int month=1;month<=12;month++)
		{
			LocalDate date=LocalDate.of(year, month,1);
			System.out.println( date.getMonth());
			
			System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");
			
			DayOfWeek d= date.getDayOfWeek();
			 int data=d.getValue();
			
			for(int i=1;i<data;i++)
			{
				System.out.print("\t");
			}
			int length=date.lengthOfMonth();
			
			for(int i=1;i<=length;i++)
			{
				LocalDate d1=date.of(year, month, i);
				DayOfWeek day=d1.getDayOfWeek();
				
				if(day==DayOfWeek.SUNDAY)
				{
					System.err.println(i+"\t");
					
				}
				else {
				
				System.out.print(i+"\t");
				}
			}
			System.out.println();
		    System.out.println();
			
		}

	}

}

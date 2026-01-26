package DateAndTimeMethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program03DateTime {

	public static void main(String args[])
	{
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	
	LocalDateTime dt1 = LocalDateTime.of(2004, 7, 7, 12, 33);
	System.out.println(dt1);
	
	/*DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a");
	LocalDateTime dt2 = LocalDateTime.parse("21/08/2025 20:30 a", format);
	System.out.println(dt2);*/
	
	
	System.out.println(dt1.getHour());//12
	System.out.println(dt1.getMonth());//7
	System.out.println(dt1.plusHours(2));//14
	System.out.println(dt1.withDayOfMonth(15));//15
	System.out.println(dt1.withHour(10));//10
	
	System.out.println(DateTimeFormatter.ISO_DATE_TIME);
	
	
	
	
	
	
	
	
	
	
	}
}

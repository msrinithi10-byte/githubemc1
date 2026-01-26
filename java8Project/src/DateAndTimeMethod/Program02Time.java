package DateAndTimeMethod;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Program02Time {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		//LocalTime time2=LocalTime.of(18, 33);
	   //LocalTime time2=LocalTime.of(18, 22, 30);
		LocalTime time2=LocalTime.of(12,30, 30,43);
		System.out.println(time2);
		
		
		/*DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime time3 =LocalTime.parse("12:30 a");
		//System.out.println(time3);
		String Str=time3.format(format);
		System.out.println(Str);*/
		
		//Instance Method----------------------
		
		System.out.println(time2.getHour());
        System.out.println(time2.getMinute());   
		System.out.println(time2.getSecond());
		
		System.out.println(time2.minusMinutes(15));
        System.out.println(time2.withSecond(0)); 
        
     
        
        
        
        
        
        
		
		
		
		
	}

	
}

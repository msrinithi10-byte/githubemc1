package DateAndTimeMethod;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Program01Date {

	public static void main(String[] args) {
		
		//Static Method
		LocalDate date=LocalDate.now();
		System.out.println(date);

		LocalDate date1=LocalDate.of(2004,07,07);
		System.out.println(date1);
		
		LocalDate date2=LocalDate.parse("2025-11-28");
        System.out.println(date2);
        
        //Instance method
        System.out.println(date2.getYear());
        
        Month month= date2.getMonth();
        System.out.println(month);
        
        System.out.println(date2.getMonthValue());
        
        System.out.println(date2.getDayOfMonth());
        
        System.out.println(date2.getDayOfWeek());
        
        System.out.println(date2.isLeapYear());
        
        System.out.println(date2.lengthOfMonth());
        
        LocalDate d1=date2.plusDays(4);
        
        System.out.println(d1);
        
        LocalDate d2=date2.minusMonths(2);
        System.out.println(d2);
        
        System.out.println(date2.withDayOfMonth(13));
        
       //Formating date
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy");//(utility method)
         LocalDate d3=LocalDate.parse("28/11/2025",format);
         System.out.println(d3);
         System.out.println(d3.format(format));
        
        
        
        
	}

}

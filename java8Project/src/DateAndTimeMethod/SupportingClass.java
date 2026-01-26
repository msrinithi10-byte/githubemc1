package DateAndTimeMethod;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class SupportingClass {

	public static void main(String[] args) {
		
		//Period -------------------
		LocalDate date1 = LocalDate.of(2020,12, 02);
		LocalDate date2 = LocalDate.of(2025, 12, 03);
		
		Period period = Period.between(date1, date2);
		
		System.out.println(period);
		System.out.println(period.getYears());
	    System.out.println(period.getDays());
        System.out.println(period.getMonths());
        
        //Duration-------------------------
        LocalTime time1 = LocalTime.of(13, 14);
        LocalTime time2 = LocalTime.of(14, 15);
        
        Duration duration = Duration.between(time1, time2);
     
        System.out.println(duration.getSeconds());
        System.out.println(time1.compareTo(time2));
        System.out.println(time2.compareTo(time1));
        System.out.println(time2.compareTo(time2));
        
        //TemporalAdjusters----------------------
        LocalDate today=LocalDate.now();
        LocalDate date = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        
        //ChronoUnit----------------------------
        LocalDate start = LocalDate.of(2025, 1, 1);
        LocalDate end = LocalDate.of(2025, 12, 1);
       
        long day = ChronoUnit.DAYS.between(start, end);
        System.out.println(day);
        
        long day1 = ChronoUnit.MONTHS.between(start, end);
        System.out.println(day1);
  
	}

}

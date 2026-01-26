package EnumerationClasss;

import java.util.EnumMap;

enum DayOfWeeks
{
SUNDAY,	
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY;
}


public class EnummapMethods {

	public static void main(String[] args) {
      EnumMap<DayOfWeeks,Float> em=new EnumMap<>(DayOfWeeks.class);
      em.put(DayOfWeeks.SUNDAY, 36.0f);
      em.put(DayOfWeeks.MONDAY, 36.0f);
      em.put(DayOfWeeks.TUESDAY, 36.0f);
      em.put(DayOfWeeks.WEDNESDAY, 36.0f);
      em.put(DayOfWeeks.THURSDAY, 36.0f);
      em.put(DayOfWeeks.FRIDAY, 36.0f);
      em.put(DayOfWeeks.SATURDAY, 36.0f);
      
      System.out.println(em);
      System.out.println(em.get(DayOfWeeks.FRIDAY));
      //System.out.println(em);
      System.out.println(em.remove(DayOfWeeks.SATURDAY));
      System.out.println(em);
      System.out.println(em.containsKey(DayOfWeeks.FRIDAY));
      System.out.println(em.containsValue(36.0f));
      System.out.println(em.size());
      System.out.println(em.keySet());
      System.out.println(em.values());
      System.out.println(em.entrySet());
      System.out.println();
      
      
	}

}

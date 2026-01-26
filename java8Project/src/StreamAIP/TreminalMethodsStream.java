package StreamAIP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Stream;


class Emp  implements Comparable<Employee>
{
String name;
int salary;

Emp(String name,int salary)
{
this.name=name;
this.salary=salary;
}

@Override
public int compareTo(Employee o) {
	
	if(this.salary < o.salary)
	{
		return -1;
	}
	else if(this.salary > o.salary)
	{
		return 1;
    }	
	return 0;
	
}

@Override
public String toString() {
	return "Emp [name=" + name + ", salary=" + salary + "]";
}



}

public class TreminalMethodsStream {
	public static void main(String args[])
	{
		List<String> list =new ArrayList<>(List.of("hello","java"));
		
		List<String> li =list.stream()
		.map((x)-> x.toUpperCase())
		.toList();
		
		System.out.println(li);
		
		//InterMediate method
		
		List<Integer> arr = new ArrayList<>(List.of(4,7,5,6,3,8,2));
		Integer op=arr.stream()
		.min((a,b)-> a-b ).get();
		System.out.println(op);
		
		
		
		Integer op1=arr.stream()
				.max((a,b)->a-b).get();
		System.out.println(op1);
		
		
		 Integer in =arr.stream()
		.findFirst().get();
		 System.out.println(in);
		 
	    Integer in1 = arr.stream()
	    .parallel().findAny().get();
	    System.out.println(in1);
				
	    long in2 = arr.stream()
	    .count();
	    System.out.println(in2);
	    
	    Long in3 = arr.stream()
	    .filter((x)->x%2 == 0)
	    .count();
	    System.out.println(in3);
	    
	    //reduce method used to Sum the value 
	    Integer in4=arr.stream()
	    .reduce(0, (x,y)-> x+y);
	   System.out.println(in4); 
	   
	  String in5= list.stream()
	   .reduce(" ",(x,y)->x+" "+y);
	  System.out.println(in5.trim());
	  
	  //AllMatch-AnyMatch-NoneMatch
	  List<Integer> arr1 = new ArrayList<>(List.of(3,5,1,7));
	  
	  boolean bol=arr1.stream()
	  .allMatch((x)->x%2 == 0);//AND
	  System.out.println(bol);
	  
	  boolean bol1= arr1.stream()
	  .anyMatch((x)->x%2 == 0);//OR
	  System.out.println(bol1);
	  
	  boolean bol2 = arr1.stream()
	  .noneMatch((x)->x%2 == 0);//NOT
	  System.out.println(bol2);
	  
	  
	  List<Integer> l1 =new ArrayList<>(List.of(3,4,8,6,7));
	  List<Integer> l2 =new ArrayList<>(List.of(11,12,13,14,15));
	  List<Integer> l3 =new ArrayList<>(List.of(16,17,18,19,20));
	  
	  List<List<Integer>> lit=new ArrayList<>();
	  lit.add(l1);
	  lit.add(l2);
	  lit.add(l3);
	  
	 Integer sum= lit.stream()
	  .flatMap((x)->x.stream())
	  .reduce(0,(x,y)->x+y);
	  
	  System.out.println(sum);
	  
	  
	  
	  ArrayList<Emp> emp = new ArrayList<>();
		emp.add(new Emp("raja",2000));
		emp.add(new Emp("raja",1000));
		emp.add(new Emp("raja",1200));
		emp.add(new Emp("raja",900));
		
		Emp ress= emp.stream()
		
		.min((a,b)->a.salary-b.salary).get();
	    System.out.println(ress);
	    
	    
	    Emp resss = emp.stream()
	    .max((a,b)->b.salary-a.salary).get();
	    System.out.println(resss);
	    
	    //Convert Stream to Arrays (toArray()-toArray(Intfunction)
	    
	    Object[] obj= Stream.of("A","B","C")
	    .toArray(); 
		System.out.println(Arrays.toString(obj));
		
		for(Object i : obj)
		{
		//i -- using this reference we cannot use String (String s = (String) obj;)
			//downcasting
			
			String s = (String)i;
			s=s.toLowerCase();
			System.out.println(s);
		}
		
		/*IntFunction<String[]> fun = new IntFunction<>()
				{

					@Override
					public String[] apply(int value) {
						
						return new String[value];
					}
			
			
				};
		
				 Object[] obj1= Stream.of("A","B","C")
						.toArray(fun);
				 System.out.println();*/
		
		Object[] obj1= Stream.of("A","B","C")
				.toArray((x)->new String[x]);
		
		System.out.println(Arrays.toString(obj1));
				
		
		ArrayList<Integer>  arr11 = new ArrayList<>(List.of(1,2,3,4,5));
		Object[]obj2= arr11.stream()
		.toArray();
		System.out.println(Arrays.toString(obj2));
		
		Set<String> set = new HashSet<>(List.of("raja","ravi"));
		Object[]obj3=set.stream()
				.map((x)->x.toUpperCase())
		.toArray();
		
		System.out.println(Arrays.toString(obj3));
		
	}

}

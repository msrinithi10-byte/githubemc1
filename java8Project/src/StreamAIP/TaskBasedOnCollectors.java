package StreamAIP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employe
{
int id;
String name;
String dept;
int salary;
int age;

Employe(int id ,String name, String dept, int salary ,int age)
{
this.id=id;
this.name=name;
this.dept=dept;
this.salary=salary;
this.age=age;
}

@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age + "]";
}

  
}

public class TaskBasedOnCollectors {

	public static void main(String[] args) {

		
		List<Employe> list = new ArrayList<>();
				
		list.add(new Employe(101,"raja","IT",1000,21));
		list.add(new Employe(102,"ravi","cs",1200,22));
		list.add(new Employe(103,"kumar","AI",1000,21));
		list.add(new Employe(104,"kavi","IT",1300,23));
		
		/*List<Employe> lis = list.stream()
	    .collect(Collectors.toList());
		System.out.println(lis);*/
		
		//1.Convert all Employee names to a list
		System.out.println("1.Convert all Employee names to a list");
		List<String> name= list.stream()
		.map((x)->x.name)
		.collect(Collectors.toList());
		System.out.println(name);
		
		
		//2.get unique departments as a set
		System.out.println("2.get unique departments as a set");
		Set<String> department = list.stream()
		.map((x)->x.dept)
		.collect(Collectors.toSet());
		System.out.println(department);
		
		//3.Store Employees in LinkedList
		System.out.println("3.Store Employees in LinkedList");
		 LinkedList<Employe> link= list.stream()
		.collect(Collectors.toCollection(()-> new LinkedList<Employe>()));
		System.out.println(link);
		
		//4.Join all employee names into a single string separated by commas
		System.out.println("4.Join all employee names into a single string separated by commas");
		 String s =list.stream()
		.map((x)->x.name)
		.collect(Collectors.joining(","));
		System.out.println(s);
		
		//5.join all department names using "|"
		System.out.println("5.join all department names using \"|\"");
		String s1=list.stream()
        .map((x)->x.dept)
        .collect(Collectors.joining("|"));
		System.out.println(s1);
		
		//6.Count total number of employees
		System.out.println("6.Count total number of employees");
		Long lo =list.stream()
		.map((x)->x.id)
		.collect(Collectors.counting());
		System.out.println("count"+lo);
		
		//7.Find total salary of all employees
		System.out.println("7.Count total salary of all employees");
		 Integer In =list.stream()
		.map((x)->x.salary)
		.collect(Collectors.summingInt((x)->x));
		System.out.println("total salary:"+In);
		
		//8.Find average age of employee
		System.out.println("8.Find average age of employee");
		 double dou =list.stream()
		.map((x)->x.age)
		.collect(Collectors.averagingDouble((x)->x));
		System.out.println("Average age:"+dou);
		
		//9.Get employee age Statistics(min,max,avg,count,sum)
		System.out.println("9.Get employee age Statistics(min,max,avg,count,sum)");
		 IntSummaryStatistics sum=list.stream()
		.map((x)->x.age)
		.collect(Collectors.summarizingInt((x)->x));
		 System.out.println(sum);
	
		 //10.Find employee with Minimum salary
		 System.out.println("10.Find employee with Minimum salary");
		 Optional<Integer> min=list.stream()
		 .map((x)->x.salary)
		 .collect(Collectors.minBy((a,b)->a-b));
		 System.out.println("min:"+min.get());
		 
		 //11.Find Employee with maximum age
		 System.out.println("11.Find Employee with maximum age");
		 Optional<Integer> max=list.stream()
		 .map((x)->x.age)
		 .collect(Collectors.maxBy((a,b)->a-b));
		System.out.println("max:"+max);
		
		//12.Find total salary using reducing()
		System.out.println("12.Find total salary using reducing()");
		Integer sal =list.stream()
		.map((x)->x.salary)
		.collect(Collectors.reducing(0,(x,y)->x+y));
		System.out.println("total salary:"+sal);
		
		//13.Find longest employee name using String
		System.out.println("13.Find longest employee name using String");
		String Opt =list.stream()
		.map((x)->x.name)
		.collect(Collectors.reducing("",(x,y)->x.length()>y.length()?x:y));
			System.out.println(Opt);
			
		//15.Get distinct employee department as an set
			System.out.println("15.Get distinct employee department as an set");
			Set<String> set=list.stream()
			.map((x)->x.dept)
			.distinct()
			.collect(Collectors.toSet());
			System.out.println(set);
			
		//16.After collecting employees as list,convert to array
			System.out.println("16.After collecting employees as list,convert to array");
			 Employe[] emp=list.stream()
			.collect(Collectors.collectingAndThen(Collectors.toList(), (x)->x.toArray(new Employe[0])));
		System.out.println(Arrays.toString(emp));
		
		
	}
}

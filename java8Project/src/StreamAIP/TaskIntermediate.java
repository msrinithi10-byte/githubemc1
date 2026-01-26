package StreamAIP;

import java.util.ArrayList;
import java.util.stream.Stream;

class Employee implements Comparable<Employee>
{
 String name;
 int salary;

Employee(String name,int salary)
{
this.name=name;
this.salary=salary;
}

@Override
public int compareTo(Employee o) {
	if(this.salary > o.salary)
	{
		return 1;
	}
	else if(this.salary < o.salary)
	{
		return -1;
    }	
	return 0;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + "]";
}
}

class Student implements Comparable<Student>
{
String name;
String dept;

Student(String name,String dept)
{
this.name=name;
this.dept=dept;
}

@Override
public int compareTo(Student o) {
	return this.name.compareToIgnoreCase(o.name);
	
}

@Override
public String toString() {
	return "Student [name=" + name + ", dept=" + dept + "]";
}



}

public class TaskIntermediate
{

	public static void main(String[] args)
	{
		
		//Filter even Number
		
		System.out.println("filter even number");
		Stream.of(1,2,3,4,5,6,7,8)
		.filter((x)-> x%2 == 0)
		.forEach(System.out::println);
		
		
		//Convert String to Uppercase
		System.out.println("string to uppercase");
		Stream.of("hello")
		.map((x)->x.toUpperCase())
		.forEach(System.out::println);
		
		//print unique values
		System.out.println("print unique value");
		Stream.of(2,3,4,6,6,7,8,8)
		.distinct()
		.forEach(System.out::println);
		
		//Skip first 2 names and print remaining
		System.out.println("Skip first 2 names");
		Stream.of("raja","ravi","ram","rat","bat")
		.skip(2)
		.forEach(System.out::println);
		
		
		//print top3 smallest number
		System.out.println("print top3 smallest number");
		Stream.of(4,6,7,1,23,9)
		.sorted().limit(3)
		.forEach(System.out::println);

		//print numbers >5 after doubling
		System.out.println("print numbers >5 after doubling");
		Stream.of(4,5,7,1,8,3,2)
		.mapToDouble((x)-> x*2).filter((x)-> x>5)
		.forEach(System.out::println);
		
		//sort names by length
		System.out.println("sort names by length");
		Stream.of("hello","hi","ravi","the")
		.map((x)->x.length()).sorted()
        .forEach(System.out::println);
		
		//Extract first charater of each word
		System.out.println("Extract first charater of each word");
		Stream.of("java","program","hello")
		.map((x)->x.charAt(0))
		.forEach(System.out::println);
		
		//Find numbers divisible by 3 or 5
		System.out.println("Find numbers divisible by 3 or 5");
		Stream.of(3,7,8,9,3,15,2,12,9)
		.filter((x)-> x%3 == 0).filter((x)-> x%5 == 0)
		.forEach(System.out::println);
		
		//Convert list of integers to their squares,then remove duplicate
		System.out.println("Convert list of integers to their squares,then remove duplicate");
		Stream.of(4,5,5,6,2,3,1,1,6,7)
		.map((x) -> x*x)
		.distinct()
		.forEach(System.out::println);
		
		
		//print employees sorted by salary
		System.out.println("print employees sorted by salary");
		ArrayList<Employee> arr= new ArrayList();
		arr.add(new Employee("kumar",1500));
		arr.add(new Employee("raja",1200));
		arr.add(new Employee("ravi",1000));
		arr.add(new Employee("ram",1300));
		
		
		arr.stream()
		.sorted()
	    .forEach(System.out::println);
		
		//print Students sorted by student name
		System.out.println("print Students sorted by student name");
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("ravi","it"));
		list.add(new Student("raja","it"));
		list.add(new Student("ram","it"));
		list.add(new Student("hello","it"));
		
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
		
		
		/*Stream.of("hello","hi","ravi","raja")
		.sorted()
		.forEach(System.out::println);*/
				
	}

}

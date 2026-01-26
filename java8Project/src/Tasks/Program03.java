package Tasks;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;



class Employee
{
private String name;
private int age;
private String dept;
private double salary;
private List<String> skills;
private LocalDate joiningdate;
private LocalDate  relivingdate;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String name, int age,String dept, double salary, List<String> skills, LocalDate joiningdate,
		LocalDate relivingdate) {
	super();
	this.name = name;
	this.age = age;
	this.dept=dept;
	this.salary = salary;
	this.skills = skills;
	this.joiningdate = joiningdate;
	this.relivingdate = relivingdate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public LocalDate getJoiningdate() {
	return joiningdate;
}
public void setJoiningdate(LocalDate joiningdate) {
	this.joiningdate = joiningdate;
}
public LocalDate getRelivingdate() {
	return relivingdate;
}
public void setRelivingdate(LocalDate relivingdate) {
	this.relivingdate = relivingdate;
}
/*@Override
public String toString() {
	return "[name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + ", skills=" + skills + ", joiningdate="
			+ joiningdate + ", relivingdate=" + relivingdate + "]";
}*/
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + "]";
}


}

public class Program03 {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(
                "Alice", 25, "IT", 45000,
                Arrays.asList("Java", "Spring"),
                LocalDate.of(2021, 3, 10),
                LocalDate.of(2025, 5, 11)
        ));

        employees.add(new Employee(
                "Bob", 30, "HR", 40000,
                Arrays.asList("Recruitment", "Communication"),
                LocalDate.of(2020, 6, 15),
                LocalDate.of(2021, 3, 10)
        ));

        employees.add(new Employee(
                "Charlie", 28, "Finance", 55000,
                Arrays.asList("Accounting", "Excel"),
                LocalDate.of(2019, 1, 5),
                LocalDate.of(2021, 3, 10)
        ));

        employees.add(new Employee(
                "David", 35, "IT", 75000,
                Arrays.asList("Java", "Microservices", "AWS"),
                LocalDate.of(2018, 9, 20),
                LocalDate.of(2021, 3, 10)
        ));

        employees.add(new Employee(
                "Eva", 26, "Marketing", 42000,
                Arrays.asList("SEO", "Content Writing"),
                LocalDate.of(2022, 2, 1),
                LocalDate.of(2024, 3, 10)
        ));

        employees.add(new Employee(
                "Frank", 40, "Management", 90000,
                Arrays.asList("Leadership", "Strategy"),
                LocalDate.of(2017, 7, 11),
                LocalDate.of(2024, 3, 31)
        ));

        employees.add(new Employee(
                "Grace", 29, "IT", 60000,
                Arrays.asList("Python", "Data Analysis"),
                LocalDate.of(2020, 11, 25),
                LocalDate.of(2021, 3, 10)
        ));

        employees.add(new Employee(
                "Henry", 32, "Support", 38000,
                Arrays.asList("Customer Service", "CRM"),
                LocalDate.of(2021, 5, 18),
                LocalDate.of(2025, 3, 10)
        ));

        employees.add(new Employee(
                "Irene", 27, "Finance", 48000,
                Arrays.asList("Taxation", "Tally"),
                LocalDate.of(2022, 8, 8),
                LocalDate.of(2023, 3, 10)
        ));

        employees.add(new Employee(
                "Jack", 45, "Operations", 85000,
                Arrays.asList("Process Management", "Logistics"),
                LocalDate.of(2016, 4, 12),
                LocalDate.of(2023, 12, 31)
        ));

        
        
        
        // IT-85000
        Comparator<Employee> com = new Comparator<>()
        		{

					@Override
					public int compare(Employee o1, Employee o2)
					{
						
					    return  (int) ((int) o1.getSalary()-o2.getSalary());
					}

					
					
        	
        	
        		};
        		 Comparator<Employee> com1 = new Comparator<>()
        				 {

							@Override
							public int compare(Employee o1, Employee o2) {
								
								return o2.getAge()-o1.getAge();
							}
        			 
        			 
        				 };
        		
        
          Map<Object, Optional<Employee>> map =employees.stream()
          .collect(Collectors.groupingBy((x)->x.getDept(),Collectors.maxBy(com)));
       
          System.out.println(map);
          
        Comparator<Employee> com2 = new Comparator<>()
        		{

					@Override
					public int compare(Employee o1, Employee o2) {
						
						int first =(int) ChronoUnit.YEARS.between(o1.getJoiningdate(), o2.getRelivingdate());
						int sec=(int) ChronoUnit.YEARS.between(o1.getJoiningdate(), o2.getRelivingdate());
						return first-sec;
					}
        	
        	
        		};
         
        		Map<String,String> map1=employees.stream()
        		.collect(Collectors.groupingBy((x)->x.getDept(),Collectors.collectingAndThen(Collectors.maxBy(com2),(x)->x.get().getName())));
                System.out.println(map1);
          
                
                //output - name-3Experience
                Map<String,Long> map2=employees.stream()
                .collect(Collectors.toMap((x)->x.getName(), (y)->ChronoUnit.YEARS.between(y.getJoiningdate(),y.getRelivingdate())));
             System.out.println(map2);

		//3=rav
            Map<Integer,List<String>>map3= employees.stream()
             .collect(Collectors.groupingBy((x)->x.getName().length(),Collectors.mapping((x)->x.getName(), Collectors.toList())));
             System.out.println(map3);
             
             //>45000 true(name>45000)
             Map<Boolean,List<String>> map4=employees.stream()
             .collect(Collectors.partitioningBy((x)->x.getSalary()>45000,Collectors.mapping((x)->x.getName(),Collectors.toList())));
             System.out.println(map4);
             
             
             //Highest age Print
             //name - higestage
            Map<Object, Optional<Employee>> map5= employees.stream()
            .collect(Collectors.groupingBy((x)->x.getAge(),Collectors.maxBy(com1)));
	System.out.println(map5);
	
	        //getName - uppercase
            String map6=  employees.stream()
              .collect(Collectors.mapping((x)->x.getName().toUpperCase(),Collectors.joining(",","{","}")));
            System.out.println(map6);  
	
	    
            
            
	}

}

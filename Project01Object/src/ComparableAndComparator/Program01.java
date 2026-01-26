package ComparableAndComparator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
    private  int id;
    private  String name;
    private  int salary;
	
	public Employee(int id,String name,int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	@Override
	public int compareTo(Employee o) 
	{
		if(this.salary > o.salary)
		{
			return -1;
		}
		else if(this.salary < o.salary)
		{
			return 1;
	    }	
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

class Sample implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
		{
			return 1;
			
		}
		else if(o1>o2)
		{
			return -1;
		}
		return 0;
	}
	
}


public class Program01 {
	public static void main(String args[])
	{
		
		
		/*PriorityQueue<Employee> pro = new PriorityQueue<>();
		pro.add(new  Employee(1,"raja",1000));
		pro.add(new  Employee(2,"raja",3000));
		pro.add(new  Employee(4,"raja",2000));
		pro.add(new  Employee(1,"raja",5000));
		System.out.println(pro.poll());*/
		
		Sample CustomCompare = new Sample();
		PriorityQueue<Integer> pro = new PriorityQueue<>(CustomCompare);
		pro.add(12);
		pro.add(5);
		pro.add(13);
		pro.add(1);
		System.out.println(pro);
		
		
		Comparator<Integer> com = new Comparator<>()
				{

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1<o2)
				{
					return 1;
					
				}
				else if(o1>o2)
				{
					return -1;
				}
				return 0;
			}
	};
				
		TreeSet<Integer> tree = new TreeSet<Integer>(new Comparator<>()
		{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
		{
			return 1;
			
		}
		else if(o1>o2)
		{
			return -1;
		}
		return 0;
	}
}
		);	
		tree.add(12);
		tree.add(2);
		tree.add(3);
		System.out.println(tree);
		
		
		
		
	}

}

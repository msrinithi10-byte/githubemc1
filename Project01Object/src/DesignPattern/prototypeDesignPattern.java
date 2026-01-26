package DesignPattern;

class Employee implements Cloneable
{
private int id;
private String name;
public Employee(int id, String name) 
{
	this.id = id;
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

@Override
protected Object clone()throws CloneNotSupportedException
{
	return super.clone();
}


}

public class prototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee obj = new Employee(107,"raja");
		obj.setName("sri");
		System.out.println(obj);
		
		Employee obj1 =(Employee)obj.clone();
		obj1.setId(340);
		System.out.println(obj1);
		

	}

}

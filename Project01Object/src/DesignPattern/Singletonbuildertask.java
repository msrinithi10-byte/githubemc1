package DesignPattern;



class User
{
private int id;
private String name;
private int age;


public User()
{
	
}

public User(int id,String name,int age)
{
this.id=id;
this.name=name;
this.age=age;

}

@Override
public String toString() {
	return "Build [id=" + id + ", name=" + name + ", age=" + age + "]";
}

static class UserBuilder
{
	private int id;
	private String name;
	private int age;
	
	
	public UserBuilder id(int id)
	{
		this.id=id;
		return this;
	}
	
	public UserBuilder name(String name)
	{
		this.name=name;
		return this;
	}
	
	public UserBuilder age(int age)
	{
		this.age=age;
		return this;
	}
	
	public  User user()
	{
		User user = new User(this.id,this.name,this.age);
		return user;
	}
	}
	
}

public class Singletonbuildertask {

	public static void main(String[] args) {
		

	}

}

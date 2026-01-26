package DesignPattern;

class Build
{
private int id;
private String name;
private int age;
private String email;

public Build()
{
	
}

public Build(int id,String name,int age,String email)
{
this.id=id;
this.name=name;
this.age=age;
this.email=email;
}

@Override
public String toString() {
	return "Build [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
}

static class UserBuilder
{
	private int id;
	private String name;
	private int age;
	private String email;
	
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
	
	public UserBuilder email(String email)
	{
		this.email=email;
		return this;
	}
    
	public  Build user()
	{
		Build build = new Build(this.id,this.name,this.age,this.email);
		return build;
	}
	}
	
}


public class BuildeDesignPattern {

      public static void main(String args[])
      {
    	  Build.UserBuilder userBuilder = new Build.UserBuilder();
    	  Build build = userBuilder.id(107).name("ravi").age(21).email("ravi107@gmail.com").user();
          System.out.println(build);
          
        
      }
}

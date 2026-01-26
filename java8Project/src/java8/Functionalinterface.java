package java8;



@FunctionalInterface
interface A
{
void add();	

String toString();

int hashCode();


default void sub()//default method 
{
System.out.println("hiiii...");	
}

static void mul()
{
System.out.println("dsgfyfi");	
}


}

class Sample implements A
{
   
	int y=1;
	int x=10;
	 
	 int Inc()
	{
		 x++;
		return x;	
	}
	 
	 int Dec()
	 {
		return y;
		 
		 
	 }
	 
	 
	@Override
	public void add() {
	System.out.println("hello..");
	}
	
}

class Program01
{
	 static void display(A obj)
	{ 
		obj.add();
	    obj.toString();
	    obj.sub();
	    
	    
	}
}

public class Functionalinterface {

	public static void main(String[] args) {
        
		//Imparative --- implementations od core java
		Sample o = new Sample();
		//Program01.display(o);

		//Declarative--- one line Function(LAMBDA)
		Program01.display(()->System.out.println("hello world"));
        
		//Impure function
		System.out.println(o.Inc());

		//pure function
		System.out.println(o.Dec());
		
		System.out.println();
		
		
}
}
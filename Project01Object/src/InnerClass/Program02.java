package InnerClass;

public class Program02 {
	
	/*int x;
	
	static class InnerClass
	 {
		 InnerClass()
		 {
			 System.out.println("constractor class");
		 }
		 
		 void display()
		 {
			 System.out.println("this display innercalss");
	      }
		 
		 static void display1()
		 {
			 System.out.println("this static display");
		 }
	 }
	
	class NonStaticClass
	{
	void Mul()
	{
		System.out.println(x+"this is x");
    }
	static void mul1()
	{	
	Program02 non=new Program02();
	System.out.println(non.x);	
	}
	}*/
	
//Local inner Class	
 void Add()
	{
		
		class Sample
		{
		void M1()
		{
			System.out.println("this is local inner class");
		}
		//Sample S1 = new Sample();
		
		}
		Sample S1 = new Sample();
		S1.M1();
	}
	
  void sub() 
  {
	
  }
	

	public static void main(String[] args) {
		
	/*Program02.InnerClass obj = new InnerClass();
	obj.display();
	Program02.InnerClass.display1();
	
	Program02 obj1 = new Program02();
	Program02.NonStaticClass obj2 = obj1.new NonStaticClass();
	obj2.Mul();
	Program02.NonStaticClass.mul1();*/
		
		Program02 obj1 = new Program02()
				{
			     int X=100;
                 void sub()
                 {
                	 System.out.println("this is child class "+X);
                 }
			
				};
	    obj1.sub();
	
	    AnonyClass Any = new AnonyClass() {

			@Override
			public void add1() {
				System.out.println("this is interface method");
				
			}
	    	
	    	
	    };
	    Any.add1();
	    
	    AnonyClass1 Any1 = new AnonyClass1()
	    		{

					@Override
					void add2() {
						System.out.println("this is abstract class");
						
					}
	    	
	    		};
	    		Any1.add2();
	 }
	
	

}

interface AnonyClass
{
	void add1();
	
}

abstract class AnonyClass1
{
abstract void add2();	
}
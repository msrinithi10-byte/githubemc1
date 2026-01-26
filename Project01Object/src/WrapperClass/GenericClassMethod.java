package WrapperClass;

class Program01<T>
{
  public void getElement(T t)
  {
	  System.out.println(t);
  }
	
}


class Program02
{
public static<T extends Number> void printdisplay(T t)
{
	System.out.println(t);
}
}


class Program03
{
	 public  Object add(Integer x, Integer y)
	{
		Integer res=x+y;
		return res;
		
	}
}

/*class A
{
	
}
class B extends A
{
	
}
class C
{
	
}*/
class Program04<T extends Number>
{
public Float sub(T x,T y)
{
	Float a = x.floatValue();
	Float b = y.floatValue();
	Float res=a+b;
	return res;
}
}

class Program05<R extends Number,E extends Number>
{
	/*public R getadd(E element)
	{
		
		//return (R) res;
		
	}
}*/
}

public class GenericClassMethod {

	public static void main(String[] args) {
	
		Program01<String> obj1 = new Program01<>();
		obj1.getElement("ndjgydg");
		
		Program02.printdisplay(123);
		
		
		//object class 
		Program03 obj2 = new Program03();
       Object obj3 =obj2.add(12,12);
       Object obj4 =obj2.add(12,12);
     
       
       //wrapper class using achive arithimetic 
       Integer res = (Integer)obj3;
       Integer res1 = (Integer)obj4;
       
       System.out.println(res+res1);
       
     
       
     //UpperBound  
	Program04<Integer> obj5 = new Program04<>();
	Float result = obj5.sub(2,2);
	System.out.println(result);

	Program05<Integer,Float> obj6 = new Program05<>();
	//Integer result1 = obj6.getadd(10.0F);
	//System.out.println(result1);
	
	}

}
package WrapperClass;

class Calculation<T extends Number>
{
public T add(T x,T y)
{
	Integer res=x.intValue()+y.intValue();
	return (T) res;

}

public Float sub(T x,T y)
{
	Float a = x.floatValue();
	Float b = y.floatValue();
	Float res=a-b;
	return res;
}

public T mul(T x,T y)
{
	Double res=x.doubleValue()*y.doubleValue();
	return (T) res;

}

public T div(T x,T y)
{
	Integer res=x.intValue()/y.intValue();
	return (T) res;

}

}

public class TaskGeneric {

	public static void main(String[] args) {
		
	   Calculation<Integer> obj = new Calculation<>();
	   Integer result=obj.add(2,2);
	   System.out.println("add tow number: "+result);
	   
	   Float result1=obj.sub(3, 4);
	   System.out.println("sub tow number: "+result1);
	   
	   Calculation<Double> obj1 = new Calculation<>();
	   Double result2=obj1.mul(12.0,13.0);
	   System.out.println("multiple number:"+result2);
	   
	   Integer result3 = obj.div(5,10);
	   System.out.println("Divided number:"+result3);
	   
	}

}

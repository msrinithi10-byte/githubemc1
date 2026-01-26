package WrapperClass;

class Calculation2<R extends Number,E extends Number>
{
	public R add(E x,E y)
	{
		Integer res=x.intValue()+y.intValue();
		return (R) res;
		
	}
	
	public R Sub(E x,E y)
	{
		Float res=x.floatValue()-y.floatValue();
		return (R) res;
		
	}
	
	public R Mul(E x,E y)
	{
	    Double res=x.doubleValue()*y.doubleValue();
		return (R) res;
		
	}
	
	public R div(E x,E y)
	{
	    Byte res=(byte) (x.byteValue()/y.byteValue());
		return (R) res;
		
	}
	
	
}

public class TaskGeneric2 {
	public static void main(String args[])
	{
		
		Calculation2<Integer,Double> obj1=new Calculation2<>();
		Integer result=obj1.add(12.0,13.0);//double pass -- return integer
		System.out.println("add value: "+result);
		
		Calculation2<Float,Integer> obj2=new Calculation2<>();
		Float result1 = obj2.Sub(5, 3);//Integer pass--- return Float
		System.out.println("sub value: "+result1);
		
		Calculation2<Double,Long> obj3=new Calculation2<>();
		Double result2 = obj3.Mul(7L, 7L);//byte pass---return double
		System.out.println("multiple value: "+result2);
		
		Calculation2<Byte,Double> obj4=new Calculation2<>();
		Byte result3=obj4.div(24.0,12.0);//double pass ---- return byte
		System.out.println("divided value: "+result3);
	}

}

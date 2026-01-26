package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface A
{
void add();
}

interface B
{
 public static void Sub(String s)
 {
	 System.out.println(s);
	}
 
 public static Boolean method(Integer obj)
 {
	return obj.equals(obj);	 
 }
}

public class StaticMethodReference {
    public static void sample()
    {
    	System.out.println("dhee");
    	System.out.println("ugdyed");
    }
	
	public static void main(String[] args) {
		
		
	
		A obj=StaticMethodReference::sample;
		obj.add();
         
		//Lambda
		Function<Double,Double> F = (x)->Math.sqrt(x);
		System.out.println(F.apply(2.00));
		
		//Static method Reference
		Function<Double,Double> F2 = Math::sqrt;
		System.out.println(F2.apply(3.00));
		
		Function<Float,Integer> F3 = Math::round;
		System.out.println(F3.apply(12.0f));
		
		//Static method calling interface
		Consumer<String> con = B::Sub;
		con.accept("jswud");
		
		Predicate<Integer> pre = B::method;
		System.out.println(pre.test(7));
		
		
		
	}

}

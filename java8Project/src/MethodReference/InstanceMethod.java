package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
 
interface Aaa
{
 default String add()
 {
	
	return "wdygd";
 }
}

public class InstanceMethod implements Aaa
{

	public String ConvertToString(int x)
	{
		switch(x)
		{
		case 1:
			return "sri..";
		case 2:
			return "vee..";
		case 3:
			return "bdeew";					
		}
		
		return "default";
	}
	
	public void Method(int x)
	{
		System.out.println(x);
		
	}
	
	public String Method1(Integer x)
	{
		return "mbhjgu"+x;
		
		
	}
	
	public static void main(String[] args) {
		InstanceMethod obj = new InstanceMethod();
		
		Function<Integer,String> Fun = obj::ConvertToString;
	    System.out.println(	Fun.apply(4));
	    
	    Consumer<Integer> Con = obj::Method;
	    Con.accept(4);
	    
	    Supplier<String> sup =obj::add;
	    System.out.println( sup.get());
	    
	    Function<Integer,String> fu = obj::Method1;
	    System.out.println(fu.apply(7));
	    
	}

}
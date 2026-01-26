package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example2Instan {
	
	public  Example2Instan()
	{
		System.out.println("kedyutedyi");
	}
	
	public Example2Instan(int x)
	{
		System.out.println(x);
		
	}
	
	public String Example3Instan(String x)
	{
		return x;
		
	}
	
	public Integer Example4(String s)
	{
		return s.length();
		
		
	}
	
	
	public static void main(String args[])
	{
		
	
		/*Supplier<Example2Instan> obj1 = new Supplier<>()
				{

					@Override
					public Example2Instan get() {
						
						return new Example2Instan();
					}
			
			
				};*/
		
				Supplier<Example2Instan> obj1 =() -> new Example2Instan();
	
				obj1.get();
				
				Supplier<Example2Instan> obj2 =Example2Instan::new;
				obj2.get();
				
				/*Consumer<Integer> obj3 = new Consumer<>()
						{

							@Override
							public void accept(Integer t) {
								System.out.println(t);
								
							}
					
					
						};*/
				
				Consumer<Integer> obj3 =(t)->System.out.println(t);
				obj3.accept(4);
				
				Consumer<Integer> obj4=Example2Instan::new;
				obj4.accept(4);
			
				
				/*Function<String,String> obj5 = new Function<>()
						{

							@Override
							public String apply(String t) {
								
								return t;
							}
					
					
						};*/
						
						Function<String,String> obj5 = (String t) -> t;
						System.out.println(obj5.apply("Ram"));
				
						Function<String,String> obj6 = String::new;
						System.out.println(obj6.apply("ravi"));
						
						 Example2Instan Ex= new  Example2Instan ();
					
					/*	Function<String,Integer> obj7=new Function<>()
								{

									@Override
									public Integer apply(String s) {
										
										return Ex.Example4(s);//Ex-objectreference -class instance
									
									//Example4--class method
										//s-argument
										//
									}
							
							
								};*/
								
								
					     Function<String,Integer> obj7=(String s) ->Ex.Example4(s);
					     System.out.println(obj7.apply("raviku"));
				
					     Function<String,Integer> obj8=Ex::Example4;
					     System.out.println(obj8.apply("nbvgyer"));
					     
	}

}

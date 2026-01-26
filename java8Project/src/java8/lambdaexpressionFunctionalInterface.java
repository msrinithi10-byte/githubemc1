package java8;

import java.nio.file.DirectoryStream.Filter;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class lambdaexpressionFunctionalInterface {
	
	public static boolean filter(Predicate<Integer> obj)
	{
		return obj.test(5);
	}

	public static void forEach(Consumer<String> obj)
	{
		obj.accept("hello");
		
	}
	
	public static String generate(Supplier<String> obj)
	{
		return obj.get();
		
	}
	
	/*public static boolean map(Function<String,Boolean> obj)
	{
		return obj.apply("hello");
		
		
	}*/
	
	public static String map(UnaryOperator<String> obj)
	{
		return obj.apply("hii....");
		
		
	}
	
	public static boolean  sample(BiPredicate<String,Integer> obj)
	{
		return obj.test("raja",4);	
	}
	

	public static void  sample3(BiConsumer<String,Integer> obj)
	{
		
		 obj.accept("the value is", 21);
		
	}

	public static boolean sample2(BiFunction<String,String,Boolean> obj)
	{
		return obj.apply("hello","hello");
		
	}
	
	public static String  sample4(BinaryOperator<String> obj)
	{
		return obj.apply("hello","hello");	
	}
	
	public static void main(String args[])
	{
		System.out.println(filter((t)-> t%2==0));
		forEach((t)-> System.out.println(t));
		System.out.println(generate(()-> "hello....."));
		//System.out.println(map(( t)->t.contains("o")));
		
		//UnaryOperator<String> obj=(t) -> t.concat("hello");
		System.out.println(map((t) -> t.concat("hello")));
		
		/*BiPredicate<String,Integer> obj= new BiPredicate<>() 
		{

			@Override
			public boolean test(String t, Integer u) {
				
				return t.length()==u;
			}
			
			
		};*/
	
		System.out.println(sample( (t,u) ->t.length()==u));
		
	/*	BiFunction<String,String,Boolean> obj= new BiFunction<>()
				{

					@Override
					public Boolean apply(String t, String u) {
						
						return t.equals(u);
					}
			
			
				};*/
		
	System.out.println(sample2((t,u)-> t.equals(u)));
	
	/*BiFunction<String,String,Boolean> obj= new BiFunction<>()
			{

				@Override
				public Boolean apply(String t, String u) {
					
					return t.equals(u) ;
				}

				
		
			};*/
			
			//BiFunction<String,String,Boolean> obj= (t,u) ->t.equals(u);
            System.out.println(sample2( (t,u) ->t.equals(u)));
         
           /* BinaryOperator<String> obj = new  BinaryOperator<>()
            		{
						@Override
						public String apply(String t, String u) {
							return t.concat(u);
						}
            	
            		};*/
            		
            		 
            System.out.println(sample4( (t,u) -> t.concat(u)));
	}
	
	
}

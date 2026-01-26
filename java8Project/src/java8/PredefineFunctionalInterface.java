package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

//interface A1<T,R>
//{
//R add(T t);	
//}
//
//@FunctionalInterface
//interface B1<T,R> extends A1<T ,R>
//{
//
//
//R add(T t);
//
//
//}
//
//class Program implements B1<String,String>
//{
//
//	@Override
//	public String add(String t) {
//		// TODO Auto-generated method stub
//		return t;
//	}	
//}
//
//interface Predicate<T>
//{
//	boolean test(T t);
//}
//
//interface Consumer<T>
//{
//void accept(T t);	
//}



public class PredefineFunctionalInterface 
{
	
//	public static boolean Filter(Predicate<String> t)
//	{
//		return t.test("hello");
//		
//	}
	
	/*public static void ForEach(Consumer<String> t)
	{
		t.accept("jbhsugdywdy");
	}*/

	public static void main(String[] args) {
//	Predicate<String> pre = new Predicate<String>()
//				{
//
//					@Override
//					public boolean test(String t) {
//						// TODO Auto-generated method stub
//						return  t.endsWith("o");
//					}
//			};
//		System.out.println(Filter(pre));
//	
//		
		Consumer<String> con = new  Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t);
					}
			
				};
		
				
				
//				Supplier<String> sup = new Supplier<String>()
//						{
//
//							@Override
//							public String get() {
//								
//								return "hello";
//							}
//					
//					
//						};
//				
//			    Stream.generate(sup);
//		        forEach(con);
//				
		        Function<Integer,String> fun=new   Function<Integer,String>()
		        		{

							@Override
							public String apply(Integer t) {
								String string="The value is:"+t;
								return string;
							}
		        	
		        	
		        		};
		        	
		        		
		        		Stream.of(1,2,3,4,45)
		        		.map(fun)
		        		.forEach(con);
		        		
				
       
	}


	
	
}

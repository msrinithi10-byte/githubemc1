package OptionalClassMethod;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program01 {

	public static void main(String[] args) {
		
		//String s=null;
		//System.out.println(s.length());//NullPointerException
		
		//Optional<String> obj= new Optional<>();
		//we cannot create the object in Optional class -- because of the constractor is private
         
		/*Optional<String> obj=Optional.empty();
		System.out.println(obj.get());
		
		
		Optional<String> obj1=Optional.of("ravi");//pass the null -NullPointerException
		System.out.println(obj1.get());*/
		
		Optional<String> obj2=Optional.ofNullable("raja"); //null-NoSuchElementException
		//System.out.println(obj2.get());
		//System.out.println(obj2.isPresent());//its return boolean value
		//System.out.println(obj2.isEmpty());//its return boolean value
		
		
		/*Consumer<String> con = new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						
						System.out.println(t.toUpperCase());
					}
			
			
				};*/
				
		        //Lambda Expression
		        Consumer<String> con = (t)-> System.out.println(t.toUpperCase());
		        obj2.ifPresent(con);
	           // obj2.ifPresent(String::toUpperCase);->method Referencre
		
		       
		         System.out.println(obj2.orElse("Default"));
		         
		         
		       /* Supplier<String> sup = new Supplier<>()
		        		{

							@Override
							public String get() {
								
								return "default";
							}
		        	
		        	
		        		};*/
		        		
		        		Supplier<String> sup =() -> "default";
		                System.out.println(obj2.orElseGet(sup));
		                
		                
		    try {
		        String s=obj2.orElseThrow(()->{throw new RuntimeException("no default data");});                
		        System.out.println(s);
		    }
		    catch(RuntimeException e)
		    {
		    	System.out.println(e.getMessage());
		    }
		    
		   //Transformation
		    
		   /* Function<String,String> fun = new  Function<>()
		    		{

						@Override
						public String apply(String t) {
							
							return t.toUpperCase();
						}
		    	
		    	
		    		};*/
		    //Function<String,String> fun =(t) ->t.toUpperCase();
		    
		    
		 // System.out.println(obj2.map(String::toUpperCase).map((t)->t+" all"));
		    
		    try
		    {
		String st=  obj2.map(String::toUpperCase).map((t)->t+" all").orElseThrow(()->{throw new RuntimeException("no data found");});
		    System.out.println(st);
		    }
		    catch(RuntimeException e)
		    {
		    	System.out.println(e.getMessage());
		    	
		    }
		    
		    Predicate<String> pre = (t) -> t.contains("a");
					obj2.filter((t) -> t.contains("a")).ifPresent(System.out::println);
		
		
		
		
		
		
	}

}

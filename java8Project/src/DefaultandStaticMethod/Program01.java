package DefaultandStaticMethod;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Program01 {
	public static void main(String args[])
	{
		//Predicate Default and static method
		
		Predicate<Integer> obj = (x)-> x <5;
		
		Predicate<Integer> obj1= (x)-> x<=5;
		
		Predicate<Integer> res= obj.and(obj1);
		
		Predicate<Integer> res1= obj.or(obj1);
		

		
		System.out.println(res.test(4));
		System.out.println(res1.test(5));
		
		Predicate<Integer> obj3= (x)-> x==7;
	    Predicate<Integer> res3=obj3.negate();
		
		
	    System.out.println(res3.test(7));
	    
	    Predicate<String> f1 =  Predicate.isEqual("hello");
	    System.out.println(f1.test("hello"));
	    
	    //Function Default and static 
	    
	    Function<String, String> F1 = (x)-> x+ " h";
	    Function<String, String> F2 = (x)-> x+ " y";
	   
	    Function<String, String> ress = F1.andThen(F2);
	    System.out.println(ress.apply("hello "));
	  
	    
	    Function<String, String> F3 = (x)-> x+ " h";
	    Function<String, String> F4 = (x)-> x+ " y";
	   
	    Function<String, String> resss = F3.compose(F4);
	    System.out.println(resss.apply("hello "));
	  
	    Function<String,String> F5= Function.identity();
	    System.out.println(F5.apply("hi...."));
		
	    
	    //Consumer --Default Method 
	    
	    Consumer<String> C1 = (x)-> System.out.println(x+" 1");
	    Consumer<String> C2 = (x)->System.out.println(x+" 2");
    
	    Consumer<String> re= C1.andThen(C2);
	    re.accept("sri.....");
	  
	    //UnaryOperator --Default and static method
	    
	    UnaryOperator<String> U1 = (x)-> x + " raja";
	    UnaryOperator<String> U2 = (x)-> x+" nvg";
	    
	    Function<String, String> ree=U1.andThen(U2);
	    System.out.println(ree.apply("ravi"));
		
	    UnaryOperator<String> U3 = (x)-> x + " raja";
	    UnaryOperator<String> U4 = (x)-> x+" nvg";
	    
	    Function<String, String> reee=U1.compose(U2);
	    System.out.println(reee.apply("ravi"));
	    
	    
	    UnaryOperator<String> re1 = UnaryOperator.identity();
	    System.out.println(re1.apply("ravi..."));
	    
	    //BinaryOperator No-Default static Method
	    
	    Comparator<Integer> com=new Comparator<Integer>()
	    		{

					@Override
					public int compare(Integer o1, Integer o2) {
						
						return o1 - o2;
					}
	    	
	    		};
	    
	    BinaryOperator<Integer> Bi = BinaryOperator.minBy(com);
	    int min=Bi.apply(21, 2);
	    System.out.println(min);
	    
	    BinaryOperator<Integer> Bii= BinaryOperator.maxBy(com);
	    int max= Bii.apply(21,7);
	    System.out.println(max);
	    
		
	    //BiPredicate -default Method(and,or,negate)
	    
	    BiPredicate<String,Integer> Bip = (x,y)-> x.length()==y;
	    
	    BiPredicate<String,Integer> Bip1 = (x,y)-> x.length()==y;
	    BiPredicate<String,Integer>re2= Bip.and(Bip1);
	    
	    System.out.println(re2.test("hello", 5));
	    
	    BiPredicate<String,Integer>re3= Bip.or(Bip1);
	    System.out.println(re3.test("hello", 4));
	    
	    BiPredicate<Integer,Integer> Bip11= (x,y)-> x.equals(y);
	    BiPredicate<Integer,Integer> res11=Bip11.negate();
	    System.out.println(res11.test(4,4));
		
	   
	    
	    //BiConsumer-Default (andthen )
	    BiConsumer<String,String> Bic =(x,y)->System.out.println(x+ " 1 "+y ); 
	    BiConsumer<String,String> Bic1 =(x,y)->System.out.println(x+ " 2 "+y);
	     
	    BiConsumer<String,String> re4=Bic1.andThen(Bic);
	    re4.accept("hello","man");
	    
	    //BiFunction-Default (AndThen)
	    
	    BiFunction<Integer,Integer,Integer> Bif = (x,y)->x+y;//7
	    Function<Integer,Integer> fu1 =(x)->x*x;
	    
	    BiFunction<Integer,Integer,Integer> Bif1=Bif.andThen(fu1);
	    System.out.println(Bif1.apply(3, 4));
	   
	    
	  
	    
		
	}

}

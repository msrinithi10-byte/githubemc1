package DefaultandStaticMethod;

import java.util.function.Predicate;

public class DefaultStaticMethod {

	public static void main(String args[]) {
	
	
	Predicate<Integer> obj = (x)-> x <5;
	
	Predicate<Integer> obj1= (x)-> x<=5;
	
	Predicate<Integer> res= obj.and(obj1);
	
	Predicate<Integer> res1= obj.or(obj1);
	

	
	System.out.println(res.test(4));
	System.out.println(res1.test(5));
	
	Predicate<Integer> obj3= (x)-> x==7;
    Predicate<Integer> res3=obj3.negate();
	
	
    System.out.println(res3.test(4));
    
    Predicate<String> f1 =  Predicate.isEqual("hello");
    System.out.println(f1.test("hello"));

	
	
	
	
	
	
}
}
package MethodReference;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConstractorMethod {
	
	public ConstractorMethod()
	{
		System.out.println("hiiii ... default");	
	}
	public ConstractorMethod (int x)
	{
		System.out.println("hello"+x);
		
	}

	public static void main(String[] args) {
		
		Consumer<Integer> con = ConstractorMethod::new;
		con.accept(10);
	
		Supplier<ConstractorMethod> sup =ConstractorMethod::new;
		ConstractorMethod obj=	sup.get();
		
		
		
		
	}

}

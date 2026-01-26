package MethodReference;

import java.util.function.Consumer;

interface Sample
{
public static void Program01(int x)
{
	System.out.println(x);
}
}

public class Example01 {
		
	public static void main(String args[])
	{
	
		//Anonymos
		/*Consumer<Integer> con= new Consumer<>()
				{

					@Override
					public void accept(Integer t) {
						System.out.println(t);
						
					}
			
			
				};*/
				
		//lambda expression
				Consumer<Integer> con= (t) ->System.out.println(t);	
				con.accept(4);
		
		//Method Reference		
		        Consumer<Integer> con1 = Sample::Program01;
		        con.accept(4);
		
	 	
	}

}

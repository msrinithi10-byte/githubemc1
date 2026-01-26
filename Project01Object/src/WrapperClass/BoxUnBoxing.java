package WrapperClass;

class Generic01<T>
{
public T display(T x)
{
	return x;
	
}
}


public class BoxUnBoxing {
	public static void main(String args[])
	{
		/*Generic01<Byte> obj = new Generic01<>();
		byte s=10;
		Byte res=obj.display(s);
		System.out.println(res);*/
		
		Generic01<Float> obj = new Generic01<>();
		Float res=obj.display(10.0F);
		System.out.println(res);
		
		
		
		
		
		
		
	    //Boxing ---Manual
		int x=10;
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		
		//Boxing---Auto
		int a=20;
		int b=a;//internally invoked Integer.valueOf()
		System.out.println(b);
		
		
		//UnBoxing --- Manual
		Integer c= 30;
		int d = c.intValue();
		System.out.println(d);
		
		//UnBoxing ----- Auto
		Integer e=40;
		int f=e;
		System.out.println(f);
		
		
		
		
		
	}

}




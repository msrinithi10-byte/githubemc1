package EnumerationClasss;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

enum Sample
{
  CONTINUE(100),//0
  PAGE_NOT_FOUND(404),//1
  INTERNAL_SEVER_ERROR(500);//2

	int statusCode;
Sample(int statusCode)
{
this.statusCode=statusCode;
}

public int getstatusCode()
{
	return statusCode;
	
}


}



enum Sample2
{
	Hello
	{
		 void add()
		{
			
		System.out.println("Add Method with enum class");	
		}
		
	}

	
}

enum Sample3
{
USER_NAME("RAVI"),
USER_ID("107");

	String value;
Sample3(String value)
{
	this.value=value;
}
public String toString()
{
	return value;
	
}
	
}


public class Program01 {

	public static void main(String[] args) {
	System.out.println(Sample.CONTINUE+"-"+Sample.CONTINUE.getstatusCode());

	System.out.println(Sample.INTERNAL_SEVER_ERROR);
	//Sample2.Hello.add();
	Sample[] arr=Sample.values();
	System.out.println(Arrays.toString(arr));
	
	//System.out.println(Sample.valueOf("CON"));//IllegalArgumentException
	
    System.out.println(Sample.CONTINUE.ordinal());
    System.out.println(Sample.INTERNAL_SEVER_ERROR.name());
    
    System.out.println(Sample.PAGE_NOT_FOUND.equals(Sample.PAGE_NOT_FOUND));
    System.out.println(Sample.CONTINUE.compareTo(Sample.INTERNAL_SEVER_ERROR));
    
    Class<Sample>clazz= Sample.CONTINUE.getDeclaringClass();
    System.out.println(clazz.getName());//EnumerationClasss.Sample
    
    
    
    
    
    
    
    
    
	}

}

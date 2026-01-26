package WrapperClass;

public class WapperClassConstantsHelperMethod {
	
	public static void main(String args[])
	{
		//String to Number Convertion
		int n = Integer.parseInt("25");
		System.out.println(n);
		
		double d = Double.parseDouble("12");
		System.out.println(d);
		
		//Number to String Conversion
		String s1=Integer.toString(12);
		System.out.println(s1);
		
		String s2=Float.toString(13);
		System.out.println(s2);
		
		//Value of(create Wrapper object)
		Integer x = Integer.valueOf(12);
		System.out.println(x);
		
		Double y = Double.valueOf(12.0);
		System.out.println(y);
		
		//comparing wrapper class
		Integer a=50,b=30; //(a<b = -1) (a>b = 1) (a=b = 0)
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));

		//convert to different base(binary 2, hexa 16, octal 8)
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toHexString(255));
		System.out.println(Integer.toOctalString(100));
		
		//checking range or property
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('a'));
		
		
	}
	
}




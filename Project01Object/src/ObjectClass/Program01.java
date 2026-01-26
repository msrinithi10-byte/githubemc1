package ObjectClass;
public class Program01 implements Cloneable
{
	int no;
	String name;
	Program01(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	@Override
    protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public String toString()
	{
	return "Program{"+"no"+no+",name"+name+"}";
	}
	

	public static void main(String args[]) throws CloneNotSupportedException 

	{
		Program01 obj=new Program01(100,"raja");
		Program01 obj1=(Program01)obj.clone();
		obj.no=200;
		System.out.println(obj);
		System.out.println(obj1);
	}
	
}

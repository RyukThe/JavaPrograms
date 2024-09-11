package Access_Specifiers;

public class Private_2 
{
	//example 1:example of private access specifier
	private int a;
	
	public Private_2()
	{
		a=10;
	}
	
	private void Square()
	{
		System.out.println("square="+a*a);
	}
	public static void main(String[] args)
	{
		Private_2 p1=new Private_2();
		p1.Square();
		System.out.println(p1.a);
	}
}

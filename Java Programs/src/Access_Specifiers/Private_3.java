package Access_Specifiers;

public class Private_3 
{
	//example 1:example of private access specifier
	private int a;
	
	public Private_3()
	{
		a=10;
	}
	
	private void Square()
	{
		System.out.println("square="+a*a);
	}
	public static void main(String[] args)
	{
		Private_3 p1=new Private_3();
		p1.Square();
		System.out.println(p1.a);
	}
}

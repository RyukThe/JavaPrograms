package Access_Specifiers;

public class Private_1 
{
	
	private int a;
	
	public Private_1()
	{
		a=110;
	}
	
	private void Square()
	{
		System.out.println("square="+a*a);
	}
	public static void main(String[] args)
	{
		Private_1 p1=new Private_1();
		p1.Square();
		System.out.println(p1.a);
	}
}

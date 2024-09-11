package Access_Specifiers;

public class Private_6 
{
	
	private int a;
	
	public Private_6()
	{
		a=110;
	}
	
	private void Square()
	{
		System.out.println("square="+a*a);
	}
	public static void main(String[] args)
	{
		Private_6 p1=new Private_6();
		p1.Square();
		System.out.println(p1.a);
	}
}

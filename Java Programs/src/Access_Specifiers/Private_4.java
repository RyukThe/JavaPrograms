package Access_Specifiers;

public class Private_4 
{
	
	private int a;
	
	public Private_4()
	{
		a=110;
	}
	
	private void Square()
	{
		System.out.println("square="+a*a);
	}
	public static void main(String[] args)
	{
		Private_4 p1=new Private_4();
		p1.Square();
		System.out.println(p1.a);
	}
}

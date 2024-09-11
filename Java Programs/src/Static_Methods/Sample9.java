package Static_Methods;

public class Sample9 
{
	public static void main(String[] args) 
	{
		a1();
		a2();
		a2();
		a1();
	}
	
	public static void a1()
	{
		System.out.println("inside a1 method");
	}
	public static void a2()
	{
		System.out.println("inside a2 method");
	}
}

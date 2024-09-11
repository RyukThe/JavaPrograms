package Static_Methods;

public class Sample6 
{
	public static void main(String[] args)
	{
		System.out.println("Hiii....");
		System.out.println("bye");
		demo1();
		demo1();
		demo2();
	}
	
	//static regular method
	public static void demo1()
	{
		System.out.println("Inside demo1 method");
	}
	
	public static void demo2()
	{
		System.out.println("Inside demo2 method");
	}
}

package Static_Methods;

public class Sample5
{
	//static regular method call from class
	public static void main(String[] args)  //pre-defined method
	{
		System.out.println("Inside main method");
		Demo1();
		Demo2();
		Demo2();
	}
	
	//static regular method
	public static void Demo1()
	{
		System.out.println("running method demo1");
	}
	
	public static void Demo2()
	{
		System.out.println("running method demo2");
	}
}

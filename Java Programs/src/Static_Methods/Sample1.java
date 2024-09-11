package Static_Methods;

public class Sample1 {
	
	//1)static regular methods call from same class
	public static void main(String args[])
	{
		System.out.println("Inside Main method");
		System.out.println("Welcome");
		demo();  //method calling:- methodname();
		demo1();
	}
	
	//static regular method
	public static void demo()
	{
		System.out.println("Welcome to Demo class");
		System.out.println("running method demo");
	}
	
	//static regular method
	public static void demo1()
	{
		System.out.println("Welcome to demo 1 class");
		System.out.println("Running method demo 1");
	}
	
}

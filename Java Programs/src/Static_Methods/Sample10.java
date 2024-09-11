package Static_Methods;

public class Sample10 
{
	public static void main(String[] args) 
	{
		
		System.out.println("main method body");
		dummy2();
		dummy1();
		dummy3();
	}
	
	public static void dummy1()
	{
		System.out.println("Dummy1 method body");
		System.out.println("hello Dummy1 method ");
	}
	public static void dummy2()
	{
		System.out.println("Dummy2 method body");
		System.out.println("hello Dummy2 method ");
	}
	public static void dummy3()
	{
		System.out.println("Dummy3 method body");
		System.out.println("hello Dummy3 method ");
	}
}

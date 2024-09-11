package method_Integration;

public class Sample6
{
	public static void main(String[] args) 
	{
		hello();
		
		Sample6 s6=new Sample6();
		s6.hello1();
		
		Demo2 d2=new Demo2();
		d2.method2();
		
		Demo2.method1();
	}
	
	public static void hello()
	{
		System.out.println("Running regular static method hello from Same class");
	}
	
	public void hello1()
	{
		System.out.println("Running regular non static method hello from Same class");
	}
}

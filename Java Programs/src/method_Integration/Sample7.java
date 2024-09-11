package method_Integration;

public class Sample7
{
	public static void main(String[] args)
	{
		m1();
		
		Sample7 s7=new Sample7();
		s7.m2();
		
		Demo2 d1=new Demo2();
		d1.method3();
		
		Demo2.method1();
	}
	
	public static void m1()		
	{
		System.out.println("Running static method from same class");
	}
	
	public void m2()		
	{
		System.out.println("Running non-satic method from same class");
	}
}

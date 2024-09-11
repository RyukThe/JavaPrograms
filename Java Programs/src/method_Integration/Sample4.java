package method_Integration;

public class Sample4
{
	public static void main(String[] args) 
	{
		m1();
		
		Sample4 s4=new Sample4();
		s4.m2();
		
		Demo2 d2=new Demo2();
		d2.method3();
		
		Demo2.method1();
	}
	
	public static void m1()
	{
		System.out.println("Running regular static method from same class");
	}
	
	public void m2()
	{
		System.out.println("Running non static method from same class");
	}
}

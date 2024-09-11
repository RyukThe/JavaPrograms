package method_Integration;

public class Sample8 
{
	public static void main(String[] args) 
	{
		m1();
		
		Sample8 s8=new Sample8();
		s8.m2();
		
		Demo1.m3();
		
		Demo1 d1=new Demo1();
		d1.m4();
	}
	
	public static void m1()		//method without parameter
	{
		System.out.println("Running static method from same class");
	}
	
	public void m2()		//method without parameter
	{
		System.out.println("Running non-satic method from same class");
	}
}

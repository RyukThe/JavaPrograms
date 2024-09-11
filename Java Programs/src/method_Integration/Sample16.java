package method_Integration;

public class Sample16
{
	public static void main(String[] args)
	{
		
		m1();		;
		
		
		Demo1.m3();			
		
		
		
		Sample16 s1=new Sample16();
		s1.m2();					
		
		
		
	
		Demo1 d1=new Demo1();		
		d1.m4();
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

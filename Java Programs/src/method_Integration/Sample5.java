package method_Integration;

public class Sample5
{
	public static void main(String[] args) 
	{
		
		m1();
		
		Sample5 s5=new Sample5();
		s5.m2();
		
		Demo1 d1=new Demo1();
		d1.m4();
		
		Demo1.m3();
		
	}
	
	public static void m1()
	{
		System.out.println("Running regular static method from same class");
	}
	
	public void m2()
	{
		System.out.println("Running non-static method from same class");
	}
}

package method_Integration;

public class Sample9 
{
	public static void main(String[] args)
	{
		s1();
		
		Sample9 s9=new Sample9();
		s9.s2();
		
		Demo2 d2=new Demo2();
		d2.method3();
		
		Demo2.method1();
	}
	
	public static void s1()
	{
		System.out.println("Running regular static method s1 from Same class");
	}
	
	public void s2()
	{
		System.out.println("Running non static method s2 from Same class");
	}
}

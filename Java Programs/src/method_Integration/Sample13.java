package method_Integration;

public class Sample13
{
	public static void main(String[] args) 
	{
		
		s1();
		
		Sample13 obj=new Sample13();
		obj.m2();
		
		Demo1 d1=new Demo1();
		d1.m4();
		
		Demo1.m3();
		
	}
	
	public static void s1()
	{
		System.out.println("Running regular static method s1 from same class");
	}
	
	public void m2()
	{
		System.out.println("Running non-static method m2 from same class");
	}
}

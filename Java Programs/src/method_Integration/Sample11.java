package method_Integration;

public class Sample11 
{
	public static void main(String[] args) 
	{
		
		m1();
		
		Sample11 obj=new Sample11();
		obj.m2();
		
		Demo1 d1=new Demo1();
		d1.m4();
		
		Demo1.m3();
		
	}
	
	public static void m1()
	{
		System.out.println("Running regular static method m1 from same class");
	}
	
	public void m2()
	{
		System.out.println("Running non-static method m2 from same class");
	}
}

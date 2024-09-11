package method_Integration;

public class Sample15
{
	public static void main(String[] args) 
	{
		
		method1();
		
		Sample15 obj=new Sample15();
		obj.m2();
		
		Demo1 d1=new Demo1();
		d1.m4();
		
		Demo1.m3();
		
	}
	
	public static void method1()
	{
		System.out.println("Running regular static method method1 from same class");
	}
	
	public void m2()
	{
		System.out.println("Running non-static method m2 from same class");
	}
}

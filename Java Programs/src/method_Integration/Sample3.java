package method_Integration;

public class Sample3
{
	public static void main(String[] args) 
	{
		b1();
		
		Sample3 obj=new Sample3();
		obj.b2();
		
		Demo2.method1();
		
		Demo2 d2=new Demo2();
		d2.method2();
		
	}
	
	public static void b1()
	{
		System.out.println("Inside static method  from same class");
	}
	
	public void b2()
	{
		System.out.println("Inside non static methd from Same class ");
	}
}

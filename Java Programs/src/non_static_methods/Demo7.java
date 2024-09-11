package non_static_methods;

public class Demo7
{
	//non static regular method call from same class
	public static void main(String[] args)
	{
		
		Demo7 d7=new Demo7();
		d7.m1();
		d7.m2();
		d7.m3();
		
	}
	
	public void m1() 
	{
		System.out.println("hiiiiiii");
		System.out.println("Inside non static method b1");
	}
	public void m2() 
	{
		
		System.out.println("Inside non static method b2");
	}
	public void m3() 
	{
		
		System.out.println("Inside non static method b2");
	}
}

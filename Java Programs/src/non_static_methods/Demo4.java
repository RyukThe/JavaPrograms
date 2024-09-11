package non_static_methods;

public class Demo4 
{
	//non static regular method call from same class
	public static void main(String[] args) 
	{
		Demo4 d4=new Demo4();
		d4.m1();
		d4.m2();
		d4.m3();
	}
	
	public void m1() 
	{
		System.out.println("Inside non static method m1");
	}
	public void m2() 
	{
		System.out.println("Inside non static method m2");
	}
	public void m3() 
	{
		System.out.println("Inside non static method m3");
	}
}

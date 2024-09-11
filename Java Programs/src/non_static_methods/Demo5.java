package non_static_methods;

public class Demo5
{
	//non static regular method call from same class
	public static void main(String[] args)
	{
		Demo5 d5=new Demo5();
		d5.a1();
		d5.a2();
		d5.a1();
	}
	
	public void a1() 
	{
		System.out.println("hiiiiiii");
		System.out.println("Inside non static method a1");
	}
	public void a2() 
	{
		System.out.println("hiiiiiii");
		System.out.println("Inside non static method a2");
	}
}

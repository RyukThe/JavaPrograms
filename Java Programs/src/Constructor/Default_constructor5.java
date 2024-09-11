package Constructor;

public class Default_constructor5 
{
	public static void main(String[] args)
	{
		Default_constructor5 d5=new Default_constructor5();
		d5.a1();
		d5.a2();
		
		System.out.println("--------------------");
		
		Sample1 s1=new Sample1();
		s1.m3();
		
		System.out.println("-------------------");
		
		Sample2 s2=new Sample2();
		s2.demo();
	}
	public void a1() 
	{
		System.out.println("hiiiii");
	}
	
	public void a2()
	{
		System.out.println("welcome");
	}
}

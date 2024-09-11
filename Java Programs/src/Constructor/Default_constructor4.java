package Constructor;

public class Default_constructor4 
{
	public static void main(String[] args)
	{
		Default_constructor4 d4=new Default_constructor4();
		d4.m1();
		d4.m2();
		
		System.out.println("---------------------");
		
		Sample1 s1=new Sample1();
		s1.m3();
		
		System.out.println("---------------------");
		
		Sample2 s2=new Sample2();
		s2.demo();
	}
	
	public void m1() 
	{
		System.out.println("Inside method m1 from same class");
		
	}
	
	public void m2() 
	{
		System.out.println("Inside method m2 from same class");
	}
}

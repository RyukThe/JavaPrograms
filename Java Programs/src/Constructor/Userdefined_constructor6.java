package Constructor;

public class Userdefined_constructor6
{
	int a;
	int b;
	
	Userdefined_constructor6()
	{
		a=88;
		b=66;
	}
	
	public void m1()
	{
		System.out.println(a+b);
	}
	
	public void m2()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		Userdefined_constructor5 u5=new Userdefined_constructor5();
		u5.m1();
		u5.m2();
		
		System.out.println("----------------");
		
		Demo1 d1=new Demo1();
		d1.Sub();
	}
}

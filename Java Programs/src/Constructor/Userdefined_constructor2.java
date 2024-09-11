package Constructor;

public class Userdefined_constructor2
{
	int a;
	int b;
	
	Userdefined_constructor2()
	{
		a=10;
		b=50;
	}
	public void add() 
	{
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(b-a);
	}
	
	public static void main(String[] args) 
	{
		Userdefined_constructor2 u2=new Userdefined_constructor2();
		u2.add();
		u2.sub();
		
		System.out.println("-------------------------------");
		
		Demo1 d1=new Demo1();
		d1.Sub();
	}
}

package Constructor;

public class constructor_overloading2
{
	//constructor overloading with multiple parameter
	int a;
	int b;
	String sname;
	//userdefined constructor constructor witout parameter
	
	constructor_overloading2()
	{
		a=500;
		b=100;
	}
	
	constructor_overloading2(int x,int y)
	{
		a=x;
		b=y;
	}
	constructor_overloading2(String name)
	{
		sname=name;
		
	}
	public void mul()
	{
		System.out.println(a*b);
	}
	public void Div() 
	{
		System.out.println(a/b);
	}
	public void name() 
	{
		System.out.println(sname);
	}
	public static void main(String[] args)
	{
		constructor_overloading2 c2=new constructor_overloading2();
		c2.mul();
		c2.Div();
		
		System.out.println("-------------------------------");
		
		constructor_overloading2 c3=new constructor_overloading2(20,2);
		c3.mul();
		c3.Div();
		
		System.out.println("--------------------------------");
		constructor_overloading2 c4=new constructor_overloading2("Pramod");
		c4.name();
		
		
		
	}
}

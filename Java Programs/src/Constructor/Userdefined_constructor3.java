package Constructor;

public class Userdefined_constructor3 
{
	// variable declaration
	
	int x;
	int y;
	
	Userdefined_constructor3()
	{
		x=5;
		y=10;
	}
	
	public void add() 
	{
		System.out.println(x+y);
	}
	public void div()
	{
		System.out.println(y/x);
	}
	public static void main(String[] args) 
	{
		Userdefined_constructor3 u3=new Userdefined_constructor3();
		u3.add();
		u3.div();
		
		System.out.println("--------------------------");
		Demo2 d2=new Demo2();
		d2.m1();
	}
}

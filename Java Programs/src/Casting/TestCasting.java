package Casting;

public class TestCasting
{
	public static void main(String[] args)
	{
		
//		Son s=new Son();
//		s.laptop();
//		s.car();
//		s.money();
//		s.home();
		
		//create object of subclass with reference of superclass
		
		Father f=new Son();	//sysnatx of upcasting
		f.car();
		f.money();
		f.home();
	}
}

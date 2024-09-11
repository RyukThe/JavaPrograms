package Polymorphism;

public class Sample
{
	public static void main(String[] args)
	{
		Method_overRiding1 m1=new Method_overRiding1();
		m1.Bike();
		m1.car();
		m1.money();
		
		System.out.println("---------------------------");
		
		Method_OverRiding m2=new Method_OverRiding();
		m2.car();
		m2.money();
		m2.Home();
	}
	
}

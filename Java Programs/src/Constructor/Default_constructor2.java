package Constructor;

public class Default_constructor2 
{
	//default constructor-->provided by compliler
	//use: to copy all member of that class into object
	//default_constructor()
	//{
	//
	//}
	
	public void demo()
	{
		System.out.println("running demo method from same class");
	}
	public void demo1()
	{
		System.out.println("running demo1 metod from same class");
	}
	
	public static void main(String[] args) 
	{
		Default_constructor2 d1=new Default_constructor2();
		d1.demo();
		d1.demo1();
		
		System.out.println("---------------------------");
		
		//constructor call from diff class
		
		Sample1 s1=new Sample1();
		s1.m3();
		s1.m4();
		
		
	}
}

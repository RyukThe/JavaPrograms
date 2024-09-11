package Constructor;

public class Default_constructor8
{
	

	//example1: default constructor
	
	//default constructor--> provided by compliler
	//  Default_conatructor()
	//	{
	//		
    //	}
	
	public void m1()
	{
			System.out.println("runnung method m1");
	}
	
	public void m2()
	{
		System.out.println("running method m2");
	}
	
	public static void main(String[] args)
	{
		//constructor call from same class
		Default_constructor1 d1=new Default_constructor1();
		d1.m1();
		d1.m2();
		
		//default_constructor-->classname-->datatype
		//d1-->object name->to identify/refer object
		//new -->keyword-->to create empty/blank oject
		//default_constructor1-->constructor call()-->to copy all member of class into that object
		
		System.out.println("-------------------------------");
		
		//constructor call from diff class
		
		Sample1 s1=new Sample1();
		s1.m3();
		
	}
	
}

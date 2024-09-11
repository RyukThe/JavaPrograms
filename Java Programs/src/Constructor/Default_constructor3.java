package Constructor;

public class Default_constructor3
{
	//default constructor-->provided by compliler
	
	//  Default_conatructor()
	//	{
	//		
   //	}
	
	public void s1()
	{
		System.out.println("Running mehtod s1 from same class");
	}
	public void s2()
	{
		System.out.println("running method s2 from same class");
	}
	
	public static void main(String[] args) 
	{
		
		Default_constructor3 d3=new Default_constructor3();
		d3.s1();
		d3.s2();
		
		System.out.println("------------------------------------");
		
		Sample1 s1=new Sample1();
		s1.m3();
		s1.m4();
		
		System.out.println("------------------------------------");
		
		Sample2 s2=new Sample2();
		s2.demo();
	
	}
}

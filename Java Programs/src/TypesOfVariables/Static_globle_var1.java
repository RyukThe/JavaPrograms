package TypesOfVariables;

public class Static_globle_var1
{
	//2: static global variable 
	static int s=100;
	
	public static void main(String[] args)
	{
		//static global variable call from same class
		System.out.println(s);	//variable name
		m1();
		
		//		Static_globle_var1 v1=new Static_globle_var1();
		//		v1.m2();
		
		//static global variable call from diff class
		
		System.out.println(Demo1.a);		//diffclassname.varname
		
		
	}
	
	public static void m1()
	{
		System.out.println(s);
	}
	
	public void m2()
	{
		System.out.println(s);
	}
}

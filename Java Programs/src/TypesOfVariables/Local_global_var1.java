package TypesOfVariables;

public class Local_global_var1
{
	//1: example of local & global variable
	
	int a=10;					//global variable
	
	public void m1()
	{
		int b=20;				//local variable
		System.out.println(b);
		System.out.println(a);
	
	}
	public void m2()
	{
		int c=30;				//local variable
		System.out.println(c);
		System.out.println(a);	//global  var
	}
}

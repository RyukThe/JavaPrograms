package TypesOfVariables;

public class Static_globle_var2 
{
	static int x=50;
	
	public static void main(String[] args) 
	{
		System.out.println(x);
		
		s1();
		
		System.out.println( Demo1.a);
	}
	
	public static void s1()
	{
		System.out.println(x);
		int y=55;
		System.out.println(y);
	}
}

package TypesOfVariables;

public class Non_static_global_var1 
{
	// non static variable 
	
	int a=10;
	
	public static void main(String[] args) 
	{
		//non static variable call from same class
		
		Non_static_global_var1 n1=new Non_static_global_var1();
		System.out.println(n1.a);
		
		//non static variable call from diff class
		Demo2 d2=new Demo2();
		System.out.println(d2.s);
		
		m1();
	}
	
	public  static void m1() 
	{
		Non_static_global_var1 n1=new Non_static_global_var1();
		System.out.println(n1.a); 
	}
	
	
}

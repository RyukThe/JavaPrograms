package Access_Specifiers;

public class Default_1 
{
	//example of default access specifier
	int a;
	
	Default_1()			//default access specifier
	{
		a=20;
	}
	
	public void Square() 
	{
		System.out.println("square:"+a*a);
	}
	public static void main(String[] args) 
	{
		Default_1 d1=new Default_1();
		d1.Square();
		System.out.println(d1.a);
		
	}
}

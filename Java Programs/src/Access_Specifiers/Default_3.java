package Access_Specifiers;

public class Default_3 
{
	//example of default access specifier
	int a;
	
	Default_3()			//default access specifier
	{
		a=20;
	}
	
	public void Square() 
	{
		System.out.println("square:"+a*a);
	}
	public static void main(String[] args) 
	{
		Default_3 d1=new Default_3();
		d1.Square();
		System.out.println(d1.a);
		
	}
}

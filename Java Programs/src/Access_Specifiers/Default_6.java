package Access_Specifiers;

public class Default_6 
{

	int a;
	
	Default_6()			
	{
		a=2450;
	}
	
	public void Square() 
	{
		System.out.println("square:"+a*a);
	}
	public static void main(String[] args) 
	{
		Default_6 d1=new Default_6();
		d1.Square();
		System.out.println(d1.a);
		
	}
}

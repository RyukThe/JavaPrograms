package Access_Specifiers;

public class Default_5 
{
	
	int a;
	
	Default_5()			
	{
		a=20;
	}
	
	public void Square() 
	{
		System.out.println("square:"+a*a);
	}
	public static void main(String[] args) 
	{
		Default_5 d1=new Default_5();
		d1.Square();
		System.out.println(d1.a);
		
	}
}
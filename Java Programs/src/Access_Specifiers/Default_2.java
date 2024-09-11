package Access_Specifiers;

public class Default_2 
{
	
	int a;
	
	Default_2()			
	{
		a=454;
	}
	
	public void Square() 
	{
		System.out.println("square:"+a*a);
	}
	public static void main(String[] args) 
	{
		Default_2 d1=new Default_2();
		d1.Square();
		System.out.println(d1.a);
		
	}
}

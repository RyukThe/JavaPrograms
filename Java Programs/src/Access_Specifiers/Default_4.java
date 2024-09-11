package Access_Specifiers;

public class Default_4 
{

	int a;
	
	Default_4()			
	{
		a=20;
	}
	
	public void Square() 
	{
		System.out.println("square:"+a*a);
	}
	public static void main(String[] args) 
	{
		Default_4 d1=new Default_4();
		d1.Square();
		System.out.println(d1.a);
		
	}
}

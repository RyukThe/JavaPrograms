package ExceptionHandling;

public class Example13 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int div=0;
		
		try
		{
			div=a/b;		//risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException divide by O handled");
		}
		
		System.out.println(div);
		
		System.out.println("Hiiiiiii");
		System.out.println("Welcome");
	}
}

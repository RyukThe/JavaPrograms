package ExceptionHandling;

public class Example1 
{

	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		
		try
		{
			ar[4]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hello");
	}
}

package ExceptionHandling;

public class Example5 
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];
		
		try
		{
			ar[6]=10;
		
		}
		catch(Exception e)
		{
			System.out.println("generic exception handled");
			e.printStackTrace();
		}
		
		System.out.println("hi");
	}
}

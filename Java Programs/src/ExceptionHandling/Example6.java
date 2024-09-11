package ExceptionHandling;

public class Example6 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		
		try
		{
			ar[6]=20;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(Exception e3)
		{
			System.out.println("generic exception handled");
			e3.printStackTrace();
		}
		System.out.println("hello...");
	}
}

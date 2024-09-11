package ExceptionHandling;

public class Example4
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];
		
		try
		{
			ar[4]=10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("bye..............");
	}
}

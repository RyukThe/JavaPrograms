package Control_statements;


public class Nested_if5
{
	public static void main(String[] args)
	{
		int SA=5000;
		
		if(SA>=500)
		{
			System.out.println("NO delivery charges Applied");
			
			if(SA>2000)
			{
				System.out.println("Additional 5% discount");
			}
			else
			{
				System.out.println("No Additional discount");
			}
		}
		else
		{
			System.out.println("50 rs Delivery charges applied");
		}
	}
}

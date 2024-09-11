package Control_statements;

public class Nested_if6
{
	public static void main(String[] args) 
	{
		int SA=6000;
		
		if(SA>=500)
		{
			System.out.println("no delivery charges applied");
			
			if(SA>=3000)
			{
				System.out.println("15% discount Applied on ICICI credit card");
			}
			else
			{
				System.out.println("No Additional Discount");
			}
			
		}
		else
		{
			System.out.println("100 rs delivery chrges Applied");
		}
	}
}

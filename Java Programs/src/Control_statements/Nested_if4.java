package Control_statements;

public class Nested_if4
{
	public static void main(String[] args)
	{
		int ShoppingAmount=1200;
		
		if(ShoppingAmount>=500)
		{
			System.out.println("No delivery charges applied");
			
			if(ShoppingAmount>10000)
			{
				System.out.println("Additional 10% discount");
			}
			else
			{
				System.out.println("no additional discount");
			}
		}
		else
		{
			System.out.println("50rs delievery charges Applied");
		}
	}
}

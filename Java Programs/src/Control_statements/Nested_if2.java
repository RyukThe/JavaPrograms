package Control_statements;

public class Nested_if2 
{
	public static void main(String[] args)
	{
		int PEM=450;
		
		if(PEM>=300)
		{
			System.out.println("u r eligible for mains exam");
			int MEM=600;
			if(MEM>=600)
			{
				System.out.println("got selected");
			}
			else
			{
				System.out.println("Rejected: MEM<600");
			}
		}
		
		else
		{
			System.out.println("Not eligible for exam");
		}
		
	}
}

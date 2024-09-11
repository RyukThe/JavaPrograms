package Control_statements;

public class Nested_if1 
{
	public static void main(String[] args)
	{
		int PEM=300;
		
		if(PEM>=300)
		{
			System.out.println("U r eligible For Mains exam");
			
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
			System.out.println("Non Eligible for main");
		}
		
	}
}

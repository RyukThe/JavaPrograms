package Control_statements;

public class Nested_if3 
{
	public static void main(String[] args) 
	{
		int PEM=150;
		if(PEM>=300)
		{
			System.out.println("u r eligible main Exams");
			
			int MEM=700;
			
			if(MEM>=600)
			{
				System.out.println("got selected");
			}
			else
			{
				System.out.println("Rejected");
			}
		}
		else
		{
			System.out.println("not eligible for mains");
		}
		
	}
}

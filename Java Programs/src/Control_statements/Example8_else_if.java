package Control_statements;

public class Example8_else_if 
{
	public static void main(String[] args)
	{
		int m=46;
		
		if(m>=75)
		{
			System.out.println("Distiction");
		}
		else if(m>=60 & m<=75)
		{
			System.out.println("1st class");
		}
		else if(m>=50 & m<=60)
		{
			System.out.println("2nd class");
		}
		else if(m>=35 & m<=50)
		{
			System.out.println("pass");
		}
		else if(m<=35)
		{
			System.out.println("fail");
		}
	}
}

package Control_statements;

public class Example5_else_if 
{
	public static void main(String[] args) 
	{
		int m=56;
		
		if(m>=75)
		{
			System.out.println(" garde : A+");
		}
		else if(m>=60 & m<=75)
		{
			System.out.println(" garde : A");
		}
		else if(m>=50 & m<=60)
		{
			System.out.println(" garde : B");
		}
		else if(m>=35 & m<=50)
		{
			System.out.println(" garde : C");
		}
		else
		{
			System.out.println(" garde : D");
		}
	}
}

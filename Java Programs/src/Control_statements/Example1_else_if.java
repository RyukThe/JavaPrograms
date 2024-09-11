package Control_statements;

public class Example1_else_if 
{
	public static void main(String[] args) 
	{
		
		int marks=30;
		
		if(marks>=70)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60 & marks<=70)
		{
			System.out.println("1st class");
		}
		else if(marks>=50 & marks<=60)
		{
			System.out.println("2nd class");
		}
		else if(marks>=35 & marks<=50)
		{
			System.out.println("Pass");
		}
		else if(marks<=35)
		{
			System.out.println("fail");
		}
	}
}

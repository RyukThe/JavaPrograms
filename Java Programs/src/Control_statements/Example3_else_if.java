package Control_statements;

public class Example3_else_if
{
	public static void main(String[] args) 
	{
		int m=300;
		int n=700;
		int p=900;
		
		if(m>=n & m>=p)
		{
			System.out.println("M is grater");
		}
		else if(n>=m & n>=p)
		{
			System.out.println("n id grater");
		}
		else if(p>=m & p>=n)
		{
			System.out.println("P is grater");
		}
		else
		{
			System.out.println("fail");
		}
	}
}

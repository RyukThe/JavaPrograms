package Star_Pattern;

public class Pattern11 
{
	public static void main(String[] args)
	{
		int star=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}
}

package Star_Pattern;

public class Pattern41
{
	public static void main(String[] args) 
	{
		int star=1;
		
		for(int i=1;i<=15;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}
}
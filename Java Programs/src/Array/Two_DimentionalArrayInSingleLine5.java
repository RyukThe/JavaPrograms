package Array;

public class Two_DimentionalArrayInSingleLine5 
{
	public static void main(String[] args)
	{
		int [][] ar= {{11,22,33},{44,55,66}};
		
		System.out.println(ar[0][1]);
		
		System.out.println(ar.length);
		
		System.out.println("Print 2D Array");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}

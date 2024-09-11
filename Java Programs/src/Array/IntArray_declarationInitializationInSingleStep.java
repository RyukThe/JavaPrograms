package Array;

public class IntArray_declarationInitializationInSingleStep 
{
	public static void main(String[] args) 
	{
		int [] ar= {400,100,200,300,500};
		
		System.out.println(ar[0]);
		System.out.println(ar.length);
		
		System.out.println("----print all data from int array-------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
}

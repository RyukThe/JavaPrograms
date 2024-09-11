package Array;

public class PrintArrayInReverseOrder3 
{
	public static void main(String[] args)
	{
		int []ar=new int[3];
		
		ar[0]=12;
		ar[1]=15;
		ar[2]=20;
		
		System.out.println(ar[1]);
		System.out.println(ar.length);
		
		System.out.println("print original array");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("print array in reverse order");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}
}

package Array;

import java.util.Arrays;

public class ArraySorting1
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];
		
		ar[0]=10;
		ar[1]=30;
		ar[2]=20;
		ar[3]=50;
		ar[4]=40;
		
		System.out.println(ar[0]);
		
		System.out.println(ar.length);
		
		System.out.println("Print original data");
		for(int i=0;i<=4;i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		System.out.println("Print array in Ascending order");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("Print array in Descending order");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}

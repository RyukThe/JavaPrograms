package Array;

import java.util.Arrays;

public class ArraySorting
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];
		
		ar[0]=400;
		ar[1]=100;
		ar[2]=300;
		ar[3]=200;
		
		System.out.println("print original data");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		
		System.out.println("Print array in Ascending order");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("print array in decending order");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}

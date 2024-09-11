package Array;

public class Example_intArray
{
	public static void main(String[] args) 
	{
		//array declaration
		int []arr=new int[5];
		
		//array initialization
		
		arr[0]=100;
		arr[1]=101;
		arr[2]=102;
		arr[3]=103;
		arr[4]=104;
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		//print all data from array
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("------------------------------------");
		
		//another way using length-1 property
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}

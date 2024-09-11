package Array;

public class Example_StringArray6
{
	public static void main(String[] args) 
	{
		String [] arr=new String[3];
		
		arr[0]="awrewdsfds";
		arr[1]="sadsa";
		arr[2]="sdasd";
		
		System.out.println(arr[2]);
		System.out.println("lenght of array: "+arr.length);
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

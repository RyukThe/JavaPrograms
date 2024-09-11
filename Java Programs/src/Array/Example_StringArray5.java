package Array;

public class Example_StringArray5
{
	public static void main(String[] args) 
	{
		String [] arr=new String[3];
		
		arr[0]="Saurav";
		arr[1]="Siya";
		arr[2]="Tiya";
		
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

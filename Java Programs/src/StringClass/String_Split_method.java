package StringClass;

public class String_Split_method 
{
	public static void main(String[] args)
	{
		String s1="My name is Saurav";
		
		String[] ar=s1.split(" ");	
		
		System.out.println(ar.length);
		System.out.println(ar[3]);
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}

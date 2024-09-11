package Array;

public class Example_CharArray 
{

	public static void main(String[] args) 
	{
		char [] ar=new char[4];		//char array
		
		ar[0]='A';
		ar[1]='A';
		ar[2]='c';
		ar[3]='D';
		
		System.out.println(ar[0]);
		
		System.out.println(ar.length);
		
		System.out.println("Print all Array list");
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("------------------------------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
	
	
}

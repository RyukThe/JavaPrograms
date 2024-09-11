package Loops;

public class Do_while_loop4 
{
	public static void main(String[] args)
	{
		int s=2;
		int i=1;
		do
		{
			//System.out.println("Table of 2 is = "+s);
			System.out.println("2 * "+i+" = "+s);
			i++;
			s=s+2;
		}
		while(s<=20);
	}
}

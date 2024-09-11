package Access_specifiers1;

import Access_Specifiers.Protected_2;


public class Sample2 extends Protected_2
{
	protected int a5;
	protected int b5;
	protected int x5;
	protected int y5;
	protected Sample2()
	{
		
	}
	protected Sample2(int a2,int b2, int c2,int d2)
	{
		a5=a2;
	b5=b2;
		x5=c2;
		y5=d2;
	}
	protected void printinfo()
	{
		System.out.println("++++++++++++");
		System.out.println(a5);
		System.out.println(a5+b5+x5+y5);
	}
	public static void main(String[] args) 
	{
		System.out.println("-----@@@@@-----");
		//Sample2 s2=new Sample2();
		//s2.Addition();
		Sample2 s2=new Sample2();
		s2.Addition();
		
		Sample2 s3=new Sample2(10,20,30,60);
		s3.printinfo();
	}
}

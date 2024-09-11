package This_super_keyword;

public class Sample2 extends Sample1
{
	//int a=30;		//global variable form super class
	
	int a=10;     //global variable from same class
	
	public void m1()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		s2.m1();
	}
	
	
}

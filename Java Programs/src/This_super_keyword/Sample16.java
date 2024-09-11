package This_super_keyword;

public class Sample16 extends Sample1
{
	int c=10;
	
	public void m2()
	{
		int c=40;
		System.out.println(c);
		System.out.println(this.c);
		System.out.println(super.c);
	}
	public static void main(String[] args) 
	{
		Sample16 s3=new Sample16();
		s3.m2();
	}
}

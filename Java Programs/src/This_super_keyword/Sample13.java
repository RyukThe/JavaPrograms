package This_super_keyword;

public class Sample13 extends Sample1
{
	int d=5;
	
	public void m3()
	{
		int d=6;
		
		System.out.println(d);
		System.out.println(this.d);
		System.out.println(super.d);
	}
	public static void main(String[] args)
	{
		Sample13 s4=new Sample13();
		s4.m3();
		
	}
}

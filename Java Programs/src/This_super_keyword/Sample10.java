package This_super_keyword;

public class Sample10 extends Sample1
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
		Sample10 s4=new Sample10();
		s4.m3();
		
	}
}

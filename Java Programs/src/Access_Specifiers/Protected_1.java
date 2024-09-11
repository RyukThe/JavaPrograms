package Access_Specifiers;

public class Protected_1
{
	protected int s;
	protected int t;
	
	protected Protected_1()
	{
		s=3;
		t=10;
	}
	
	protected void Addition()
	{
		System.out.println(s+t);
	}
	
	protected void Cube() 
	{
		System.out.println(s*s*s);
	}
	
	public static void main(String[] args) 
	{
		Protected_1 p1=new Protected_1();
		p1.Cube();
		p1.Addition();
		System.out.println(p1.s);
		System.out.println(p1.t);
	}
}
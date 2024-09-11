package Access_Specifiers;

public class Protected_2
{
	protected int a;
	protected int b;
	protected int x;
	protected int y;
	
	protected Protected_2(int a1,int b1,int x1,int y1)
	{
		a=a1;
		b=b1;
		x=x1;
		y=y1;
	}
	
	protected Protected_2()
	{
	a=10;
	b=20;
	x=20;
	y=6;
	}
	
	protected void Addition()
	{
		System.out.println(a+b);
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	{
//		Protected_2 p2=new Protected_2(10,5,3,6);
//		p2.Addition();
//		System.out.println("variables");
//		System.out.println(p2.a);
//		System.out.println(p2.b);
//		System.out.println(p2.x);
//		System.out.println(p2.y);
		
		System.out.println("----------##-----------");
		Protected_2 p3=new Protected_2(10,20,5,6);
		p3.Addition();
		
				
	}
	
}

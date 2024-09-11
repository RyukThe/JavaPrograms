package Access_Specifiers;

public class Public_1
{
	public int s;
	
	public Public_1()
	{
		s=22;
	}
	
	public void m1()
	{
		System.out.println(s+2);
	}
	
	public static void main(String[] args) 
	{
		
		Public_1 p1=new Public_1();
		p1.m1();
	}
}

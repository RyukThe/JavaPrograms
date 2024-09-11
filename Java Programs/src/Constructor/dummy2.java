package Constructor;

public class dummy2 
{
	int x;
	int y;
	
	public dummy2(int p,int q)
	{
		x=p;
		y=q;
	}
	
	public void sub()
	{
		System.out.println("sub="+(x-y));
	}
	
	public void div() 
	{
		System.out.println("Division="+(x/y));
	}
	
//	public static void main(String[] args) {
//		dummy1 d1=new dummy1(5,6);
//		
//		d1.sub();
//	}
}

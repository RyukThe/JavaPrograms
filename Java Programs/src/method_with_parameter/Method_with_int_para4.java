package method_with_parameter;

public class Method_with_int_para4 
{
	public static void main(String[] args) 
	{
		Add();
		
		sub(100,50);
		
		Method_with_int_para4 m4=new Method_with_int_para4();
		m4.mul(9, 5);
	}
	
	public static void Add()
	{
		int s=65;
		int t=78;
		int sum=s+t;
		System.out.println("Total Addition: "+sum);
	}
	
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	public void mul(int m,int n)
	{
		System.out.println(m*n);
	}
}

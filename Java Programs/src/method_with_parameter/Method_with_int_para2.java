package method_with_parameter;

public class Method_with_int_para2 
{
	public static void main(String[] args) 
	{
		Addition();
	
		mul(5,3);
		
		Method_with_int_para2 m1=new Method_with_int_para2();
		m1.Sub(60,20);
	}
	
	public static void Addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void mul(int m,int n)
	{
		System.out.println(m*n);
	}
	
	public void Sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	
	
	
}

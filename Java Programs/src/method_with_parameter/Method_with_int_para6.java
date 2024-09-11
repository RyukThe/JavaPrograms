package method_with_parameter;

public class Method_with_int_para6
{
	public static void main(String[] args) 
	{
		Add();
		
		sub(150,5);
		
		Method_with_int_para6 m6=new Method_with_int_para6();
		m6.mul(19, 5);
		m6.mul(210, 5);
	}
	
	public static void Add()
	{
		int s=60;
		int t=77;
		int sum=s+t;
		System.out.println("Total Addition: "+sum);
	}
	
	public static void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println("Substraction= "+sub);
	}
	
	public void mul(int m,int n)
	{
		int mul=m*n;
		System.out.println("Multiplication= "+mul);
	}
}

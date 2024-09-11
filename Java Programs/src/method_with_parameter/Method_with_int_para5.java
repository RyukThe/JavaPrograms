package method_with_parameter;

public class Method_with_int_para5 
{
	public static void main(String[] args) 
	{
		Add();
		
		sub(100,50);
		
		Method_with_int_para5 m5=new Method_with_int_para5();
		m5.mul(91, 5);
		m5.mul(110,4);
	}
	
	public static void Add()
	{
		int s=45;
		int t=98;
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

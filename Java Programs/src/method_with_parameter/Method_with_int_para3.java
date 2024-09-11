package method_with_parameter;

public class Method_with_int_para3
{
	public static void main(String[] args) 
	{
		Add();
		
		Mul(10,8);
		Mul(5,4);
		
		Method_with_int_para3 m3=new Method_with_int_para3();
		m3.Div(4, 2);
	}
	
	public static void Add()
	{
		int a=60;
		int b=70;
		int sum=a+b;
		System.out.println("Sum= "+sum);
	}
	
	public static void Mul(int m,int n)
	{
		int Mul=m*n;
		System.out.println("Multiplication= "+Mul);
	}
	
	public void Div(int a,int b)
	{
		int Div=a/b;
		System.out.println("Division= "+Div);
		
	}
}

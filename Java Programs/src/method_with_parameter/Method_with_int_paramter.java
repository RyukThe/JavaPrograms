package method_with_parameter;

public class Method_with_int_paramter 
{
	public static void main(String[] args) 
	{
		Addition();
		
		Substraction(20, 5);
		Substraction(400,100);
		
		Method_with_int_paramter m1=new Method_with_int_paramter();
		m1.Multiplication(20, 2);
		m1.Multiplication(5, 10);
	}
	
	public static void Addition()	//static regular method without parameter
	{
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		System.out.println("Total= "+sum);
	}
	
	//static regular method with two integer parameter
	public static void Substraction(int a,int b)
	{
		int sub=a-b;
		System.out.println("Substraction= "+sub);
	}
	
	//non-static method with parameter
	public void Multiplication(int m,int n) 
	{
		System.out.println(m*n);
	}
}

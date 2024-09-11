package Polymorphism;

public class Method_overloading1 
{
	public void Multiplication(int a,int b) 
	{
		System.out.println("Answer="+(a*b));
	}
	public void Multiplication(int a,int b,int c) 
	{
		System.out.println("multiplication="+(a*b*c));
	}
	public void Multiplication(int a,int b,int c,int d) 
	{
		System.out.println("Mul="+(a*b*c*d));
	}
}

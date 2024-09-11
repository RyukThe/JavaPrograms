package Polymorphism;

public class Method_overloading6
{
	
	public void add(int a, int b)
	{
		System.out.println("Additon="+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition="+(a+b+c));
	}
	public void Name(String fname)
	{
		System.out.println(fname);
	}
	public void Name(String fname,String lname)
	{
		System.out.println(fname+" "+lname);
	}
	
	
	
}

package non_static_methods;

public class Demo9 
{
	//non static regular method call from same class
	public static void main(String[] args) 
	{
		
		Demo9 obj=new Demo9();
		obj.sample1();
		obj.sample2();
	}
	public void sample1()
	{
		System.out.println("Running non-static method sample1");
	}
	
	public void sample2()
	{
		System.out.println("Running non-static method sample2");
	}
}

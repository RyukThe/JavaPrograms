package non_static_methods;

public class Demo10
{
	public static void main(String[] args) 
	{
		
		Demo10 obj=new Demo10();
		obj.sample1();
		obj.sample2();
	}
	public void sample1()
	{
		System.out.println("Running non-static method sample1");
	}
	
	public void sample2()
	{
		System.out.println("hiii");
		System.out.println("Running non-static method sample2");
	}
}

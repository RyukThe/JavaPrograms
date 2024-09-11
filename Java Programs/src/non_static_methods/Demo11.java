package non_static_methods;

public class Demo11
{
	public static void main(String[] args)
	{
		Demo11 d11=new Demo11();
		d11.hello();
		d11.hello2();
	}
	
	public void hello() 
	{
		System.out.println("Running non static method hello");
	}
	 public void hello2() 
	{
		 System.out.println("Running non static method hello");
	}
}

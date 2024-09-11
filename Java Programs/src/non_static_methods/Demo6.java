package non_static_methods;

public class Demo6 
{
	//non static regular method call from same class
	
		public static void main(String[] args)
		{
			
			Demo6 d6=new Demo6();
			d6.b1();
			d6.b2();
			d6.b1();
			
		}
		
		public void b1() 
		{
			System.out.println("hiiiiiii");
			System.out.println("Inside non static method b1");
		}
		public void b2() 
		{
			
			System.out.println("Inside non static method b2");
		}
}

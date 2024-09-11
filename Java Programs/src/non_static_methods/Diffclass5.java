package non_static_methods;

public class Diffclass5
{
	//non static method call from diff. class
	public static void main(String[] args)
	{
		System.out.println("welcome");
		Sample2 s2=new Sample2();	
		s2.a1();					
		s2.a2();
		
		s2.a1();
	}
}

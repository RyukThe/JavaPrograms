package non_static_methods;

public class Diffclass2 
{
	//non static method call from diff. class
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2(); 		//create object of differnt class
		s2.a1();			//method call
		s2.a2();
		System.out.println("hey how are u");
	}
}

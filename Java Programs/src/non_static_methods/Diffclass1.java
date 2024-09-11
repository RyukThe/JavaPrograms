package non_static_methods;

public class Diffclass1 
{
	//non static method call from diff. class
	public static void main(String[] args)
	{
		System.out.println("welcome");
		Sample1 s1=new Sample1();	//create object of different class
		s1.m1();					//method call  diffclassobjname.methodname()
		s1.m2();
	}
}

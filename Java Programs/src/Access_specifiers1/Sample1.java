package Access_specifiers1;

import Access_Specifiers.Protected_1;


public class Sample1 extends Protected_1
{ 
	public static void main(String[] args) 
	{
		System.out.println("Accessing protected outside package");
		Sample1 s1=new Sample1();	//create object of Same class
		s1.Cube();
		s1.Addition();
		System.out.println(s1.s);
		System.out.println(s1.t);
	}
}

package Polymorphism;

public class TestDemo4
{
	public static void main(String[] args)
	{
		Method_overloading1 m1=new Method_overloading1();
		m1.Multiplication(10, 20);
		m1.Multiplication(5, 2, 3);
		m1.Multiplication(2, 2, 3, 4);
		
		System.out.println("-------------------------------------");
		
		Method_overloading2 m2=new Method_overloading2();
		m2.Studentinfo(10);
		m2.Studentinfo("Saurav KAsture");
		m2.Studentinfo(500, 9.2f);
		m2.Studentinfo(85.50f);
		
	}
}

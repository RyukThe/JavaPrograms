package Constructor;

public class constructor_overloading1
{
	int num1;
	int num2;
	String name;
	
	
	// user defined with parameter multiple constructor -->Constructor overloading
	
	constructor_overloading1()	//userdefined constructor without parameter
	{
		num1=10;
		num2=20;
	}
	
	constructor_overloading1(int a,int b)	//userdefined constructor with 2 int parameter
	{
		num1=a;
		num2=b;
	}
	
	constructor_overloading1(String sname) //user defined constructor with String parameter
	{
		name=sname;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	
//	public void Addition()
//	{
//		System.out.println(num1+num2);
//	}
	
	public void Studinfo()
	{
		System.out.println("welcome "+name);
	}
	
	public static void main(String[] args) 
	{
		constructor_overloading1 c1=new constructor_overloading1();
		c1.add();
		
		System.out.println("------");
		
		constructor_overloading1 c2=new constructor_overloading1(10,30);
		c2.add();
		
		System.out.println("------");
		
		constructor_overloading1 c3=new constructor_overloading1("Priya");
		c3.Studinfo();
	}
	
	
}

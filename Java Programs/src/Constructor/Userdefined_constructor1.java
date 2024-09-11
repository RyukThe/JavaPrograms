package Constructor;

public class Userdefined_constructor1 
{
	//variable declaration
	int num1;
	int num2;
	
	//variable initialization
	//use 1: to initialize  global variable
	//use 2: to copy all member of class into object
	Userdefined_constructor1()		//user defined constructor/ without/zero parameter
	{
		num1=10;
		num2=20;
	}
	
	public void addition() 
	{
		System.out.println(num1+num2);
	}
	
	public void Mult()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		Userdefined_constructor1 u1=new Userdefined_constructor1();
		u1.addition();
		u1.Mult();
		
		System.out.println("-------------------------------------");
		Demo1 d1=new Demo1();
		d1.Sub();
	}
}

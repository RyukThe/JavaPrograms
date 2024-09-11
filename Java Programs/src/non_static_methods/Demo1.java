package non_static_methods;

public class Demo1 
{
	//non static regular method call from same class
	public static void main(String[] args) 
	{
		// classname objectname =new classname(); 		//syntax of object creation
		
		Demo1 d1=new Demo1(); 	//create object of same class
		d1.m1();				//method call objectname.methodname();
		
		d1.m2();
		
		//1) Demo1-> classname ->datatype
		//2) d1-> objectname -> to identify/ refer object
		//3)new-> keyword ->to create blank /empty object
		//4) Demo1 ->classname->constructor call->to copy all member of class into object
	}
	
	public void m1()
	{
		System.out.println("Running non static method m1");
	}
	public void m2()
	{
		System.out.println("Running non static method m2");
	}
}

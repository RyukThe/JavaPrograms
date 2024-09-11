package non_static_methods;

public class Demo3 
{
	//non static regular method call from same class
	public static void main(String[] args) 
	{
		//classname objectname=new classname()  //syntax for object creation
		Demo3 d3=new Demo3(); 		//create object of same class
		d3.s1(); 					//method call objectname.methodname();
		d3.s2();
		d3.s3();
		d3.s3();
		
		//1)Demo1->classname->datatype
		//2)d3-> object->to identify/refer object
		//3)new ->keyword->to create empty/blank object
		//4)Demo3->calssname()->constructor call->to copy all members of class to object
	}
	
	public void s1() 
	{
		System.out.println("Running non static method s1 ");
	}
	public void s2() 
	{
		System.out.println("Running non static method s2 ");
	}
	public void s3() 
	{
		System.out.println("Running non static method s3 ");
	}
}

package non_static_methods;

public class Demo2 
{
	//non static regular method call from same class
	public static void main(String[] args)
	{
		Demo2 d2=new Demo2();	//creation of object of same class
		d2.sample1(); 			//objectname.methodname();
		d2.sample2();
		d2.sample2();
		
		//1) Demo2 ->classname->datatype
		//2)d2->object->to identify/refer object
		//3)new->keyword->to create blank/empty object
		//3)Demo2->classname()->constructor call->to copy all members of class to object
	}
	
	public void sample1()
	{
		System.out.println("Running non-static method sample1");
	}
	
	public void sample2()
	{
		System.out.println("Running non-static method sample2");
	}
}

package non_static_methods;

public class Diffclass3 
{

	//non static method call from diff. class
	public static void main(String[] args) 
	{
		Sample3 s3=new Sample3();		//create object of differnt class
		s3.m3();				//method call
		s3.m4();
		s3.m4();
		
	}
}

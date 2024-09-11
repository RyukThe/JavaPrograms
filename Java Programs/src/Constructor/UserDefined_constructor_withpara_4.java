package Constructor;

public class UserDefined_constructor_withpara_4
{
	//user defined constructor with parameter
	
	int num1;
	int num2;
	
	//user defined constructor with 2 int parameter
	//use1:initialize global using local
	//use2:copy all member of class into object
	
	UserDefined_constructor_withpara_4(int a,int b)
	{
		num1=a;		//assign local variable to global variable
		num2=b;
	}
	
	public void addition()
	{
		System.out.print("Addition:");
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.print("multiplication:");
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) 
	{
		UserDefined_constructor_withpara_4 u1=new UserDefined_constructor_withpara_4(10, 20);
		u1.addition();
		u1.mul();
		
		UserDefined_constructor_withpara_4 u2=new UserDefined_constructor_withpara_4(2, 3);
		u2.addition();
		u2.mul();
		
		System.out.println("-------------------------------------------------");
		
		dummy1 d1=new dummy1(5, 6);
		d1.sub();
		
		dummy1 d2=new dummy1(2,4);
		d2.sub();
	}
}

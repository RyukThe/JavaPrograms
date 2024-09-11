package Constructor;

public class UserDefined_constructor_withpara_3
{
	int a;
	int b;
	
	UserDefined_constructor_withpara_3(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public void m1() 
	{
		System.out.println("a+b="+(a+b));
	}
	
	public static void main(String[] args)
	{
		UserDefined_constructor_withpara_3 u2=new UserDefined_constructor_withpara_3(6, 7);
		u2.m1();
		
		UserDefined_constructor_withpara_3 u3=new UserDefined_constructor_withpara_3(4, 1);
		u3.m1();
		
		System.out.println(".....................................................");
		
		dummy1 d1=new dummy1(20, 2);
		d1.sub();
		d1.div();
		
		dummy1 d2=new dummy1(70, 10);
		d2.sub();
		d2.div();
	}
}

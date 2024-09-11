package Constructor;

public class Userdefined_constructor4
{
	int num1;
	int num2;
	
	//user defined constructor/ without/zero parameter
	Userdefined_constructor4()
	{
		num1=10;
		num2=15;

	}
	
	public void Add()
	{
		System.out.println(num1+num2);
	}
	public void Mul()
	{
		System.out.println(num2*num1);
	}
	
	public static void main(String[] args) 
	{
		Userdefined_constructor4 u4=new Userdefined_constructor4();
		u4.Add();
		u4.Mul();
		
		System.out.println("--------------------------");
		Demo2 d2 =new Demo2();
		d2.sub();
	}
}

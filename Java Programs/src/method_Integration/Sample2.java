package method_Integration;

public class Sample2
{
	public static void main(String[] args) 
	{
		s1();
		
		Sample2 obj=new Sample2();
		obj.s2();
		
		Demo1.m3();
		
		Demo1 d1=new Demo1();
		d1.m4();
	}
	
	public static void s1()
	{
		System.out.println("Running Static regular method S1 from Same class");
	}
	
	public void s2()
	{
		System.out.println("Running non-Ststic method S2 from Same Class");
	}
}

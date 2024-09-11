package Access_Specifiers;

public class Protected_Sample1 
{
	public static void main(String[] args) 
	{
		//accesing Protected variable and method outside class
		System.out.println("Protected variable and method outside class");
		Protected_1 p1=new Protected_1();
		p1.Addition();
		p1.Cube();
		System.out.println(p1.s);
		System.out.println(p1.t);
	}
}

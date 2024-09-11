package Static_Methods;

public class Sample26 
{
	//static regular method running from different class
	public static void main(String[] args) 
	{
		System.out.println("method running from sample25 class");
		Sample25.demo();
		Sample25.demo2();
	}
}

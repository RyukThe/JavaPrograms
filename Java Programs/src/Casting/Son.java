package Casting;

public class Son extends Father
{
	public void laptop()
	{
		System.out.println("model:HP");
	}
	public void car()		//override
	{
		System.out.println("car:Kia");
	}
	public void money()		//override
	{
		System.out.println("money:2L");
	}
}

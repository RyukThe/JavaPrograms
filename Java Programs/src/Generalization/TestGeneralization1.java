package Generalization;

public class TestGeneralization1 
{
	public static void main(String[] args) 
	{
		System.out.println("-------Fetaures of Saving Account------");
		Saving s=new Saving();
		s.Widraw();
		s.deposit();
		s.MoneyTransfer();
		s.newFeatureA();
		
		System.out.println("-------Fetaures of Current Account------");
		Current c=new Current();
		c.Widraw();
		c.deposit();
		c.MoneyTransfer();
		c.newFeatureB();
		
		System.out.println("-------Fetaures of Salary Account------");
		Salary s1=new Salary();
		s1.Widraw();
		s1.deposit();
		s1.MoneyTransfer();
		s1.newFeatureC();
	}
}

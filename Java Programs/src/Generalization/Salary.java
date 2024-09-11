package Generalization;

public class Salary implements Account
{
	public void Widraw() 
	{
		System.out.println("Widraw limit:3L");
	}
	public void deposit() 
	{
		System.out.println("deposit:5L");
	}
	public void MoneyTransfer()
	{
		System.out.println("MoneyTransfer:2L");
	}
	public void newFeatureC()
	{
		System.out.println("New Feature:C");
	}
}

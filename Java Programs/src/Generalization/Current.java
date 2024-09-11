package Generalization;

public class Current implements Account
{
	public void Widraw() 
	{
		System.out.println("Widraw limit:2L");
	}
	public void deposit() 
	{
		System.out.println("deposit:3L");
	}
	public void MoneyTransfer()
	{
		System.out.println("MoneyTransfer:1L");
	}
	public void newFeatureB()
	{
		System.out.println("New Feature:B");
	}
}

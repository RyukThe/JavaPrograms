package Generalization;


public class Saving implements Account
{
	public void Widraw() 
	{
		System.out.println("Widraw limit:1L");
	}
	public void deposit() 
	{
		System.out.println("deposit:2L");
	}
	public void MoneyTransfer()
	{
		System.out.println("MoneyTransfer:50000");
	}
	public void newFeatureA()
	{
		System.out.println("New Feature:A");
	}
}

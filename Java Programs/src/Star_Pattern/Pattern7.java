package Star_Pattern;

public class Pattern7
{
	//*****
	//****
	//***
	//**
	//*
	public static void main(String[] args) 
	{
		int star=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			
		}
	}
}

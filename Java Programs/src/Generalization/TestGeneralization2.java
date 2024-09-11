package Generalization;

public class TestGeneralization2 
{
	public static void main(String[] args)
	{
		System.out.println("------Features of Jio-------");
		JIO j=new JIO();
		j.SMS();
		j.AudioCalling();
		j.Data();
		j.NewfeatureB();
		
		System.out.println("-----Features of Airtel------");
		Airtel a=new Airtel();
		a.SMS();
		a.AudioCalling();
		a.Data();
		a.NewfeatureC();
		
		System.out.println("----Features of VI-----");
		VI v=new VI();
		v.SMS();
		v.AudioCalling();
		v.Data();
		v.NewfeatureA();
	}
}

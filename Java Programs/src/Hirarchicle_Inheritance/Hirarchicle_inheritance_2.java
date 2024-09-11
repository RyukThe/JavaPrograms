package Hirarchicle_Inheritance;

public class Hirarchicle_inheritance_2
{
	public static void main(String[] args)
	{
		System.out.println("-----features of Son1-----");
		Son1 s1=new Son1();
		s1.Mobile();
		s1.Car();
		s1.Home();
		s1.money();
		
		System.out.println("-----features of Son2-----");
		Son2 s2=new Son2();
		s2.Laptop();
		s2.Home();
		s2.money();
		s2.Car();
		
		System.out.println("-----features of Son3-----");
		Son3 s3=new Son3();
		s3.Bike();
		s3.Car();
		s3.money();
		s3.Home();
		
		
	}
}

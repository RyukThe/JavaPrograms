package Polymorphism;

public class Method_overloading2
{
	public void Studentinfo(int rollno) 
	{
		System.out.println(rollno);
	}
	public void Studentinfo(String Fullname) 
	{
		System.out.println(Fullname);
	}
	public void Studentinfo(int marks,float CGPA) 
	{
		System.out.println("Marks: "+marks+" CGPA: "+CGPA);
	}
	public void Studentinfo(float per) 
	{
		System.out.println("percentage:"+per);
	}
}

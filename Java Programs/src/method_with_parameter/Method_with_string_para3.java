package method_with_parameter;

public class Method_with_string_para3 
{
	public static void main(String[] args)
	{
		Studname("Riya");
		
		System.out.println("*******************************");
		Method_with_string_para3 m3=new Method_with_string_para3();
		m3.StudFullname("siya", "roy");
		m3.StudFullname("Tiya", "roy");
		
		System.out.println("*******************************");
		
		Sample1.StudInfo("Komal", 103, 'C', 45.25f);
		
	}
	
	public static void Studname(String s1)
	{
		System.out.println(s1);
	}
	
	public void StudFullname(String fname,String lname)
	{
		System.out.println("Student name: "+fname+" "+lname);
	}
}

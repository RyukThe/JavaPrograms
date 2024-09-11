package method_with_parameter;

public class Method_with_string_para1 
{
	public static void main(String[] args) 
	{
		Studname("Priya");
		Studname("Kshitija");
		
		System.out.println("************************************");
		
		Method_with_string_para1 m1=new Method_with_string_para1();
		m1.Studentfullname("Priyanka", "Takalkar");
		m1.Studentfullname("Abc", "xyz");
		
		System.out.println("************************************");
		
		System.out.println("Name|Roll no|Grade|Percentage");
		System.out.println("------------------------------");
		Sample1.StudInfo("Sakshi",101,'A', 75.50f);
		Sample1.StudInfo("Akshay", 102, 'B', 65.55f);
	}
	
	public static void Studname(String s2)
	{
		System.out.println(s2);
	}
	
	public void Studentfullname(String fname,String lname)
	{
		System.out.println("Student name: "+fname+" "+lname);
	}
}

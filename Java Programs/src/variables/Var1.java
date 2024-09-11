package variables;

public class Var1 
{
	public static void main(String[] args)
	{
		String StudentName;
		String DepartmentName;
		int rollno;
		char Grade;
		float percentage;
		
		StudentName="Pramod ";
		DepartmentName="MBA";
		rollno=24;
		Grade='B';
		percentage=95.50f;
		
		System.out.println("Student Name= "+StudentName);
		System.out.println("Name: "+StudentName);    //reuse of code or info reuse
		System.out.println("Department Name= "+DepartmentName);
		System.out.println("Roll No= "+rollno);
		System.out.println("Percentage= "+percentage+"%");
		System.out.println("Grade= "+Grade);
	}
}

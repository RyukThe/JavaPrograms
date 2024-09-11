package UseOfStaticNonStatic;

public class EmpInfo2
{
	public static void main(String[] args) 
	{
		Emp_2 e2=new Emp_2();
		e2.Sid=1;
		e2.Sname="Sakshi";
		
		Emp_2.Principle="Shinde";
		
		Emp_2 e3=new Emp_2();
		e3.Sid=2;
		e3.Sname="Komal";
		
		Emp_2.Principle="Patil";
		
		e2.StudentInfo();
		e3.StudentInfo();
		
	}
}

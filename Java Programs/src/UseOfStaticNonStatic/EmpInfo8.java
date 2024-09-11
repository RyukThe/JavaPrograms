package UseOfStaticNonStatic;

public class EmpInfo8
{
	public static void main(String[] args) 
	{
		Emp_1 e1=new Emp_1();
		e1.EmpId=101;
		e1.Empname="Pramod";
		e1.EmpCEOname="Rocky";

		
		Emp_1 e2=new Emp_1();
		e2.EmpId=102;
		e2.Empname="Parag";
		e2.EmpCEOname="Lucky";

		
		Emp_1 e3=new Emp_1();
		e3.EmpId=103;
		e3.Empname="Saurav";
		e3.EmpCEOname="Sam";

		
		e1.EmpInfo();
		e2.EmpInfo();
		e3.EmpInfo();
	}
}

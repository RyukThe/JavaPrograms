package UseOfStaticNonStatic;

public class Emp_1 
{
	int EmpId;
	String Empname;
	String EmpCEOname;	//non static variable
	//static String empceoname; 		//static emp name; 
	
	public void EmpInfo()
	{
		System.out.println(Empname+":"+EmpId+":"+EmpCEOname);
	}
}

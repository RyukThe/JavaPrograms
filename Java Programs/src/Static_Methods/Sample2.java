package Static_Methods;


public class Sample2 {
	
	public static void main(String[] args) 	//pre-defined method
	{
		
		System.out.println("hiiii");
		Addition();
		System.out.println("bye....");
		dummy();
	}
	
	// static method 
	public static void Addition()  		// user-defined method
	{
		System.out.println("Running Addition method");
		int num1=10;
		int num2=20;
		int Add=num1+num2;
		System.out.println("Addition= " + Add);
	}
	
	public static void dummy()
	{
		System.out.println("Running Dummy method");
	}
}

package Static_Methods;

public class Sample16 {

	
	//2)Static regular method call from different class
	public static void main(String[] args) {
		
		System.out.println("Hello..........");
		Sample17.Dummy1();		//diffclassname.methodname();
		Sample17.Dummy2();
	}
	
}

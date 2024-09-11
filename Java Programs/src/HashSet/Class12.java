package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Class12 
{
	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList();    
		al.add("Saurav");
		al.add(154);
		al.add(69.5f);
		al.add('A');
		al.add(154);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
	
	}

}
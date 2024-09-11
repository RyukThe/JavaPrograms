package Generic;

import java.util.ArrayList;
import java.util.Iterator;


public class Class19
{
	public static void main(String[] args) 
	{
		

		ArrayList<String> al=new ArrayList<String>();
		al.add("Saurav");
		al.add("Kasture");
		//al.add(101);
		
		for(Object a:al )
		{
			System.out.println(a);
		}
		System.out.println();
		
		Iterator<String> k= al.iterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		
	
		
		
	}

}
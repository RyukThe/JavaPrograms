package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Class3
{
	public static void main(String[] args)
	{
		Vector V=new Vector();    
		V.add("Saurav");
		V.add(101);
		V.add(65.5f);
		V.add('A');
		V.add(101);
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		System.out.println(V.size());     
		System.out.println(V.isEmpty());    
		System.out.println(V.contains(101));   
		System.out.println(V.get(3));      
		

		V.add(4, 105);
		System.out.println(V);
		

		V.remove(4);
		System.out.println(V);
		
	
		V.set(2, 75.5f);
		System.out.println(V);
		
		System.out.println("---print Vector data using iterator cursor----");
		
		Iterator itr = V.iterator();
		while(itr.hasNext())  
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print Vector data using ListIterator cursor----");
		
		ListIterator litr = V.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("---print Vector data using for loop----");
		
		for(int i=0; i<=V.size()-1; i++) 
		{
			System.out.println(V.get(i));
		}
		
		
		System.out.println("---print Vector data using foreach loop----");
		
		for(Object s1:V)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print Vector data using enumeration cursor----");
		
		Enumeration enu = V.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
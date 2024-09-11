package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Class1
{
	public static void main(String[] args)
	{
		Vector V=new Vector();    
		V.add("rahul");
		V.add(101);
		V.add(65.5f);
		V.add('A');
		V.add(101);
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		System.out.println(V.size());     //7
		System.out.println(V.isEmpty());    //false
		System.out.println(V.contains(101));   //true
		System.out.println(V.get(3));      //A
		
		//add info in between Vector -->right shift operation
		V.add(4, 105);
		System.out.println(V);
		
		//remove/delete info in between Vector --> left shift operation
		V.remove(4);
		System.out.println(V);
		
		//update or modify info in between Vector
		V.set(2, 75.5f);
		System.out.println(V);
		
		System.out.println("---print Vector data using iterator cursor----");
		
		Iterator itr = V.iterator();
		while(itr.hasNext())   //true  fVse
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
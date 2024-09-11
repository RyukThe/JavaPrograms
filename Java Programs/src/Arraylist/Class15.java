package Arraylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Class15
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList(8);    
		al.add("Saurav");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());     
		System.out.println(al.isEmpty());    
		System.out.println(al.contains(101));  
		System.out.println(al.get(3));      
		al.add(4, 105);
		System.out.println(al);
		
		
		al.remove(4);
		System.out.println(al);
		

		al.set(2, 75.5f);
		System.out.println(al);
		
		System.out.println("---print all data using iterator cursor----");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())   //true  false
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using ListIterator cursor----");
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("---print all data using for loop----");
		
		for(int i=0; i<=al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("---print all data using foreach loop----");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
	}

}
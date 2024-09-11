package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Class7 
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("Saurav");
		ll.add(154);
		ll.add('A');
		ll.add(65.5f);
		ll.add(154);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(101));
		System.out.println(ll.get(2));      
		
		System.out.println(ll);
	
		ll.add(4,105);
		
		System.out.println(ll);
		

		ll.remove(4);
		System.out.println(ll);
		

		ll.set(0, "RAHUL");
		System.out.println(ll);
		
		System.out.println("----print info using iterator cursor----");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print info using ListIterator cursor----");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print info using for loop----");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("----print info using foreach loop----");
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
		
		
	}

}
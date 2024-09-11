package LinkedHashSet;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Class11
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Saurav");
		lhs.add(154);
		lhs.add(69.5f);
		lhs.add('B');
		lhs.add(154);
		lhs.add(null);
		lhs.add(null);
		
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(101));       
		
		lhs.remove('B');
		System.out.println(lhs);
		
		System.out.println("---print all data using iterator cursor---");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("---print all data using for each loop---");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
	}

}
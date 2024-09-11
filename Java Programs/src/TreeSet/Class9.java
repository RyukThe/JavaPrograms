package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Class9
{
	public static void main(String[] args) 
	{
		
		TreeSet tr=new TreeSet();
		tr.add(105);
		tr.add(104);
		tr.add(107);
		tr.add(101);
		tr.add(106);
		tr.add(103);
		tr.add(102);
		tr.add(102);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.contains(101));
		System.out.println(tr.isEmpty());   
		
		tr.remove(104);
		System.out.println(tr);
		
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		tr.pollFirst();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		
		
		System.out.println("-----print all data using iterator cursor-----");
		Iterator itr = tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------print all data using for each loop--------");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
		
		
	}

}

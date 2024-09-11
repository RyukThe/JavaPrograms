package Generic;

import java.util.Iterator;
import java.util.TreeSet;

public class Class5
{
	public static void main(String[] args) 
	{
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(105);
		tr.add(104);
		tr.add(107);
		tr.add(101);
		tr.add(106);
		tr.add(103);
		tr.add(102);
		tr.add(102);
		
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
		System.out.println("--------------------------------------------------");
		Iterator<Integer> p= tr.iterator();
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
		
	
		
		
	}

}
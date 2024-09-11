package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Class1 
{
	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		hs.add("Saurav");
		hs.add(154);
		hs.add(69.5f);
		hs.add('B');
		hs.add(154);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(101));   
		
		hs.remove('B');
		System.out.println(hs);
		
		System.out.println("---print alldata using iterator cursor---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("---print alldata using for each loop---");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
	}

}

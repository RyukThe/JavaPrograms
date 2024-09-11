package Arraylist;

import java.util.ArrayList;

public class Class7
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();  
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
		
		
	}

}

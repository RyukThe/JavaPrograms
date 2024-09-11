package StringClass;

public class StringClass_Methods5 
{
	public static void main(String[] args) 
	{
		String s1="Saurav";
		String s2="SAURAV";
		String s3="my name is sasdw";
		String s4="abcabc";
		String s5="";
		
		System.out.println(s5.isEmpty());		
		System.out.println(s1.isEmpty());		
		
		System.out.println(s1.concat(s2));
		System.out.println(s1+s3);
		
		System.out.println(s1.substring(3,6));	
		
		System.out.println(s1.substring(4));
		
		System.out.println("------------------------------");
		
		System.out.println(s1.length());		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));	
		System.out.println(s1.equalsIgnoreCase(s2)); 	
		System.out.println(s3.contains("sadsa"));	
		
		System.out.println("------------------------");
		
		System.out.println(s3.startsWith("my"));
		System.out.println(s3.endsWith("Prisadya"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('t'));
		System.out.println(s4.lastIndexOf('a'));
		
		System.out.println(s3.replace("sasdw", "saurav"));
		System.out.println(s3);
		
		
		
	}
}

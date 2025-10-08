package day8_09072025;

import java.util.Locale;

public class StringDemo {

	public static void main(String[] args) {
		String s="Jyothi";
		System.out.println(s);
		
		String s1=new String("jyothi");
		System.out.println(s1);
		
		String s2="";
		
		String s3="    Space all around     ";
		
		int age=26;
		
		double num=123.76666;
		
		System.out.println(s.concat(" Shukla")); //Limited only for this line, as string is not modifiable
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(3)); //it will start from 0 index
		System.out.println(s.contains(s1)); //all char should be same spelling as well
		System.out.println(s.equals(s1)); //all char should be same spelling as well
		System.out.println(s.equalsIgnoreCase(s1)); //Just checks the chars wont check for spelling and all.
		System.out.println(s.endsWith("i"));
		System.out.println(s.endsWith("R"));
		System.out.println(s.startsWith("J"));
		System.out.println(s.startsWith("R"));
		System.out.println(s.indexOf("y"));
		System.out.println(s.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.trim());
		System.out.println(s.substring(3)); // Inclusive - from 3 index it will take everything
		System.out.println(s.substring(1,3)); // 1 Inclusive and 3 Exclusive - from 1 to 2 it will take the values
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('J', 'R'));
		
		System.out.println(s.format("My Name is %s and my age is %d: ", s, age));
		System.out.println(s.format(Locale.GERMANY, "%.2f", num ));
		System.out.println("Apple,"+"Banana,"+"Apple");
		System.out.println(String.join("/", "Apple", "Banana", "Strawberry"));
		String J="Rutuja Ajit Chendake";
		String[] sp=J.split(" ");
		for(String a:sp)
		{
			System.out.println(a);
		}
		System.out.println("-----------------");
		String[] w=J.split(" ",2);
		for(String a:w)
		{
			System.out.println(a);
		}
		System.out.println(s.intern());
		String a=s1.intern();
		System.out.println(s==a);
	}

}

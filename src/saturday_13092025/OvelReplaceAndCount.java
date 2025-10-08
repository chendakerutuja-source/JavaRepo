package saturday_13092025;

import java.util.Scanner;

public class OvelReplaceAndCount {

	public static void main(String[] args) {
		String input="Hello";
		
		int count=0;
		
		String modified="";
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if("AEIOUaeiou".indexOf(ch)!=-1)// it checks whether given character is present inside the string. if char found it returns the position of char. and if char is not present it returns -1.
			{
				count++;
				modified=modified+"$"; //replaces ovel with $
			}
			else
			{
				modified=modified+ch; //Keeps same char
			}
		}
		
		System.out.println("Original String: "+input);
		System.out.println("Modified String: "+modified);
		System.out.println("Total Number of vowels:"+count);

	}

}

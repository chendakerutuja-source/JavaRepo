package stringAssignment;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String original=str.toLowerCase();
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		
		if(original.equals(reverse))
		{
			System.out.println("The String is palindrome");
		}
		else
		{
			System.out.println("The String NOT a Palindrome");
		}
	}

}


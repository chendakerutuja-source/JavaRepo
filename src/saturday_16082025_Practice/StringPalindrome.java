package saturday_16082025_Practice;

import java.util.Scanner;

public class StringPalindrome {
	
	// write a java program to check given string palindrome or not

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String reverse="";
		String original=str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
		if(original.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is Not a Palindrome");
		}

	}

}

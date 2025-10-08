package monday_Practice;

import java.util.Scanner;

public class PalindromeString {

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
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its Not Palindrome");
		}

	}

}

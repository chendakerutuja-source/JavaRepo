package sun_Prac_21092025;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
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
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}
}

package rutu_29092025;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String original=str;
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed String is: "+reverse);
		
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

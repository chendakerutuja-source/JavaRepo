package mon;

import java.util.Scanner;

public class StringPalindrome {

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
		System.out.println("Reversed String is: "+reverse);
		
		if(original.equals(reverse))
		{
			System.out.println("Given String is Palindrome");			
		}
		else
		{
			System.out.println("Given String is Not a Palindrome");
		}

	}

}

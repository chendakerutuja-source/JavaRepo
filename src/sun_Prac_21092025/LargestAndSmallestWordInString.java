package sun_Prac_21092025;

import java.util.Scanner;

public class LargestAndSmallestWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		
		String smallest=words[0];
		String largest=words[0];
		
		for(String word:words)
		{
			if(word.length()<smallest.length())
			{
				smallest=word;
			}
			if(word.length()>largest.length())
			{
				largest=word;
			}
		}
		System.out.println("Smallest word in String is: "+smallest);
		System.out.println("Largest word in String is: "+largest);

	}

}

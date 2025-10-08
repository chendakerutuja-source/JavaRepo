package tuesday_02092025;

import java.util.Scanner;

public class LargestSmallestWordString {

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
		System.out.println("smallest word: "+smallest);
		System.out.println("Largest word: "+largest);
		

	}

}

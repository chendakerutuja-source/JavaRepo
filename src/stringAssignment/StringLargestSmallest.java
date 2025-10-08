package stringAssignment;

import java.util.Scanner;

public class StringLargestSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		
		String smallest=words[0]; //Initializing smallest to the first word
		String largest=words[0]; //Initializing largest to the first word
		
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
		
		System.out.println("Smallest: "+smallest);
		System.out.println("Largest: "+largest);

	}

}

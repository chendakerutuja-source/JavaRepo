package sunday_practice_10082025;

import java.util.Scanner;

public class ToFindLargestAndSmallestWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String"); // I love programming in Java
		String str=sc.nextLine();
		
		String[] words=str.split(" "); // breaks down into array: ["I", "love", "programming", "in", "Java"]
		
		String smallest=words[0]; // I will be stored
		String largest=words[0]; // I will be stored
		
		for(String word:words)
		{
			if(word.length()<smallest.length()) // I = 1 < 1  == length is equal so no change 2.Love = 4<1 false 3.Programming = 11<1 false no change 4.in = 2<1 false no change 5.Java = 4<1 false 
			{
				smallest=word;
			}
			if(word.length()>largest.length()) // // I = 1 < 1  == length is equal so no change 2.Love=4 >1 = True Then largest=love 3.Programming =11>4 Then largest=Programming 4.in = 2>11 false no change 5.Java=4>11 false so output is Programming
			{
				largest=word;
			}
		}
		
		System.out.println("Smallest String: " +smallest);
		System.out.println("Largest String: " +largest);
		

	}

}

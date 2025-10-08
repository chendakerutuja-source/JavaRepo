package rutu_29092025;

import java.util.Scanner;

public class CountUniqueWordsInString {

	public static void main(String[] args) {
		String str="Mango is sweet";
		int count=0;
		String[] words=str.split("\\s+");
		
		for(String word:words)
		{
			if(str.indexOf(word)==str.lastIndexOf(word))
			{
				System.out.println(word+" is unique");
				count++;
			}
		}
		System.out.println("Number of Unique Words: "+count);
		
		

	}

}

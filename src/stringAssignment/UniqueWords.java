package stringAssignment;

public class UniqueWords {

	public static void main(String[] args) {
		String s="Mango is sweet and Mango is Yellow";
		int count=0;
		
		String[] words=s.split("\\s+"); //Splitting with new line
		
		for(String word: words)
		{
			if(s.indexOf(word)==s.lastIndexOf(word))
			{
				System.out.println(word+" Is Unique");
				count++;
			}
		}
		System.out.println("Number of Unique Words: "+count);

	}

}

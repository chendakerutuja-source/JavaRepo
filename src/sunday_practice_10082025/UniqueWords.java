package sunday_practice_10082025;

public class UniqueWords {

	public static void main(String[] args) {
		String s="Mango is sweet";
		int count=0;
		
		String[] words=s.split("\\s+");
		
		for(String word:words)
		{
			if(s.indexOf(word)==s.lastIndexOf(word))
			{
				System.out.println(word + " Is Unique");
				count++;
			}
		}
		System.out.println("Number of Unique words: "+count);

	}

}

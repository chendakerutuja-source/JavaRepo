package sunday_practice_10082025;

public class ProgramToCountUniqueWordsFromString {

	public static void main(String[] args) {
		String s="Mange is a sweet and it is a yellow";
		int count=0;
		
		String[] words=s.split("\\s+"); // it will be printing above string one by one - each word will be printing one down another.
		
		for(String word:words)
		{
			if(s.indexOf(word)==s.lastIndexOf(word))
			{
				System.out.println(word+ " Is Unique");
				count++;
			}
		}
		System.out.println("Number of unique words: "+count);

	}

}

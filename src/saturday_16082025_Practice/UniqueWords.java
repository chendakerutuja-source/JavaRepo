package saturday_16082025_Practice;

public class UniqueWords {

	public static void main(String[] args) {
		String s="Rutuja Is Preety";
		int count=0;
		String[] words=s.split("\\s+");
		
		for(String word:words)
		{
			if(s.indexOf(word)==s.lastIndexOf(word))
			{
				System.out.println(word+ " is unique");
				count++;
			}
		}
		System.out.println("Count of unique words: "+count);
	}

}

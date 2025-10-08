package rutuja_Saturday_23082025;

public class UniqueWords {

	public static void main(String[] args) {
		String s="Rutuja is Pretty";
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
		System.out.println("Number of unique words: "+count);

	}

}

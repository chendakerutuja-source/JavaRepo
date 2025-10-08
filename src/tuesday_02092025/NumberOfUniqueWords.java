package tuesday_02092025;

public class NumberOfUniqueWords {

	public static void main(String[] args) {
		String str="mango is sweet";
		int count=0;
		String[] words=str.split("\\s+");
		
		for(String word:words)
		{
			if(str.indexOf(word)==str.lastIndexOf(word))
			{
				System.out.println(word + " Is Unique");
				count++;
			}
			
		}
		System.out.println("Number of unique words: "+count);

	}

}

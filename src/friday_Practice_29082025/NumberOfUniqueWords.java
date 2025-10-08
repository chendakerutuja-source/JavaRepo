package friday_Practice_29082025;

public class NumberOfUniqueWords {

	public static void main(String[] args) {
		String str="Mango is Sweet";
		int count=0;
		String[] words=str.split("\\s+");
		
		for(String word:words)
		{
			if(str.indexOf(word)==str.lastIndexOf(word))
			{
				System.out.println(word+ " Is Unique");
				count++;
			}
		}
		System.out.println("Number of Unique words: "+count);

	}

}

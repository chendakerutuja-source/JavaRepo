package mon;

public class UniqueWordsInString {

	public static void main(String[] args) {
		String str="Mango is Sweet";
		int count=0;
		String[] words=str.split("\\s+");
		
		for(String word:words)
		{
			if(str.indexOf(word)==str.lastIndexOf(word))
			{
				System.out.println(word+ " is unique");
				count++;
			}
		}
		System.out.println("Count of Unique word is: " + count);

	}

}

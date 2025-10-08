package sun_Prac_21092025;

public class CountUniqueWords {

	public static void main(String[] args) {
		String str="Mango is Sweet";
		int count=0;
		
		String[] words=str.split("\\s+"); // should be small s only.
		
		for(String word:words)
		{
			if(str.indexOf(word)==str.lastIndexOf(word))
			{
				System.out.println(word+ "is Unique");
				count++;			
			}		
		}
		System.out.println("Count of Unique words: "+count);
	}
}

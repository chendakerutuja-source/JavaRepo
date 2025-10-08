package practice_09082025_Sat;


public class Unique {

	public static void main(String[] args) {
		String str="Mango is a sweet";
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
		System.out.println("Count of Unique String: "+count);
	}

}

package practice_09082025_Sat;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String word="pipeline";
		
		for(char i:word.toCharArray())
		{
			if(word.indexOf(i)==word.lastIndexOf(i))
			{
				System.out.println("First Non Repeated:"+i);
				break;
			}
			
			
		}
		
		

	}

}

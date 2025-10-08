package rutuja_Saturday_23082025;

public class FirstNonRepeative {

	public static void main(String[] args) {
		String words="pipeline";
		
		for(char i:words.toCharArray())
		{
			if(words.indexOf(i)==words.lastIndexOf(i))
			{
				System.out.println("First Nonrepeatative word: "+i);
				break;
			}
		}
		

	}

}

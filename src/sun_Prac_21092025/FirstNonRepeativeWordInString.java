package sun_Prac_21092025;

public class FirstNonRepeativeWordInString {

	public static void main(String[] args) {
		String str="pipeline";
		
		for(char words:str.toCharArray())
		{
			if(str.indexOf(words)==str.lastIndexOf(words))
			{
				System.out.println("First Non-Repeated letter is: "+words);
				break;
			}
		}

	}

}

package rutu_29092025;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		String str="pipeline";
		
		for(char words:str.toCharArray())
		{
			if(str.indexOf(words)==str.lastIndexOf(words))
			{
				System.out.println("Non repeated char is: "+words);
				break;
			}
		}

	}

}

package friday_Practice_29082025;

public class NonRepeatative {

	public static void main(String[] args) {
		String str="pipeline";
		
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println("Non Repeatative word: "+i);
				break;
			}
		}

	}

}

package saturday_16082025_Practice;

public class RemoveChar {
	
	//Write a java program to remove char from input string which is present in another string

	public static void main(String[] args) {
		String s1="Unknown";
		String s2="Un";
		
		char[] ch=s2.toCharArray();
		
		for(char c:ch)
		{
			if(s1.contains(c+""))
			{
				s1=s1.replace(c+"", "");
			}
		}
		System.out.println(s1);
	}

}

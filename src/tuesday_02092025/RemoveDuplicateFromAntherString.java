package tuesday_02092025;

public class RemoveDuplicateFromAntherString {

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

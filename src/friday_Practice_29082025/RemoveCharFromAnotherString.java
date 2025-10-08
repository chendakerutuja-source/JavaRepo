package friday_Practice_29082025;

public class RemoveCharFromAnotherString {

	public static void main(String[] args) {
		String s1="Unknown";
		String s2="Un";
		
		char[] ch=s2.toCharArray();
		
		for(char c:ch)
		{
			if(s2.contains(c+""))
			{
				s1=s1.replace(c+"", "");
			}
		}
		System.out.println(s1);

	}

}

package monday_practice_12082025;

public class RemoveCharPresentInAnotherString {

	public static void main(String[] args) {
		String s1="Another";
		String s2="other";
		
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

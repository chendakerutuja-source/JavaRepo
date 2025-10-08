package mon;

public class RemoveDuplicateCharFromAnotherString {

	public static void main(String[] args) {
		String s1="unknown";
		String s2="un";
		
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

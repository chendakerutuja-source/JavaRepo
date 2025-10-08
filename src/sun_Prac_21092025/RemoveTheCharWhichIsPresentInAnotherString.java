package sun_Prac_21092025;

public class RemoveTheCharWhichIsPresentInAnotherString {

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
		System.out.println("Removed Repeated char: "+s1);
		

	}

}

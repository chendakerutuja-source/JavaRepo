package sunday_practice_10082025;

public class ReverseString {

	public static void main(String[] args) {
		String s="Chendake";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}

}

package saturday_16082025_Practice;

public class ReverseAString {

	public static void main(String[] args) {
		String s="Rutuja Ajit Chendake";
		System.out.println(s.length());
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);

	}

}

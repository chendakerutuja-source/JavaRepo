package practice_09082025_Sat;

public class ReverseAString {

	public static void main(String[] args) {
		String str="I am a Geneious";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}

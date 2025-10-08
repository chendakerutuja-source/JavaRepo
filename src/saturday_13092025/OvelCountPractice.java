package saturday_13092025;

public class OvelCountPractice {

	public static void main(String[] args) {
		String input="Hello";
		int count=0;
		String modified="";
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if("AEIOUaeiou".indexOf(ch)!=-1)
			{
				count++;
				modified=modified+"$";
			}
			else
			{
				modified=modified+ch;
			}
		}
		System.out.println("Original String: "+input);
		System.out.println("Modified String: "+modified);
		System.out.println("Number of ovels: "+count);
	}

}

package sun_Prac_21092025;

public class OvelCountReplacement {

	public static void main(String[] args) {
		String input="Rutuja";
		int count=0;
		String modified="";
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if("AEIOUaeious".indexOf(ch)!=-1)
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
		System.out.println("Total Number of ovels: "+count);
	}

}

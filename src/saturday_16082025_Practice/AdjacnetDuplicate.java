package saturday_16082025_Practice;

public class AdjacnetDuplicate {
	
	// Java program to remove adjcent duplicate from the string
	public static String removeDups(String str)
	{
		int i=0;
		while(i<str.length()-1)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				String newStr=str.substring(0, i)+str.substring(i+2);
				return removeDups(newStr);
			}
			i++;
		}
		return str;
	}
	

	public static void main(String[] args) {
		String a="Hello";
		String result=removeDups(a);
		System.out.println("Output: "+ result);
		
	}

}

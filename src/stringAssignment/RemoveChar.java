package stringAssignment;

//2. Java Program to Remove Characters from the Input String which are Present in 2nd String

public class RemoveChar {

	public static void main(String[] args) {
		String s1="Unknown";
		String s2="Un";
		
		char[] ch=s2.toCharArray(); // ['U' , 'n']
		
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

//First iteration (c = 'U')

//s1.contains("U") → true
//
//Replace "U" with "":
//"Unknown" → "nknown"
//
//Second iteration (c = 'n')
//
//s1.contains("n") → true
//
//Replace all "n" with "":
//"nknown" → "k" + "ow" = "kow"

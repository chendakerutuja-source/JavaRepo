package stringAssignment;

public class ReverseAString {

	public static void main(String[] args) {
		String s="Rutuja Ajit Chendake";
		String reverse=""; //blank
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i); // char will be calculated from 0 index
		}
		
		System.out.println("Reversed String Is: " + reverse);
	
	}

}

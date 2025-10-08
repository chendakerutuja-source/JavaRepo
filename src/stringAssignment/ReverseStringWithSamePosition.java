package stringAssignment;

public class ReverseStringWithSamePosition {

	public static void main(String[] args) {
		String input="Hello World";
		String[] words=input.split(" ");
		StringBuilder result=new StringBuilder();
		
		for(String word:words)
		{
			StringBuilder reversedWord=new StringBuilder(word);
			result.append(reversedWord.reverse()).append(" ");
		}
		
		System.out.println("Output: "+result.toString().trim());
		

	}

}

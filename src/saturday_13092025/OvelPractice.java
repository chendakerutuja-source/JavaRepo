package saturday_13092025;

public class OvelPractice {

	public static void main(String[] args) {
		String input="Hello";
		String result=input.replaceAll("[AEIOUaeiou]", "\\$");
		
		System.out.println("Original String: "+input);
		System.out.println("Modified String: "+result);
	}

}

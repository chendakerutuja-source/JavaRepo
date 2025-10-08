package rutu_29092025;

public class OvelReplace {

	public static void main(String[] args) {
		String input="Hello";
		String result=input.replaceAll("[AEIOUaeiou]", "\\$");
		
		System.out.println("Input: "+input);
		System.out.println("Output: "+result);
		
		

	}

}

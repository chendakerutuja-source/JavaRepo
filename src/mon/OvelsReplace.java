package mon;

public class OvelsReplace {

	public static void main(String[] args) {
		String input="Rutuja";
		String result=input.replaceAll("[AEIOUaeiou]", "\\$");
		
		System.out.println("Original String: "+input);
		System.out.println("Modified String: "+result);

	}

}

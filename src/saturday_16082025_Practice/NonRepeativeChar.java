package saturday_16082025_Practice;

public class NonRepeativeChar {
	
	//Java program to find nonrepeatative char

	public static void main(String[] args) {
		String str="pipeline";
		
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println("Non Repeatative char: "+i);
				break;
			}
		}
				
	}

}

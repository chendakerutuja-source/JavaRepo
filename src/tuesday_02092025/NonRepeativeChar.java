package tuesday_02092025;

public class NonRepeativeChar {

	public static void main(String[] args) {
		String str="pipeline";
		
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
              {
	                System.out.println("first NonRepetative word: "+i);
	                break;
              }
			
		}

	}

}

package sunday_practice_10082025;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String word="pipeline";
		
		for(char i:word.toCharArray()) // Convert to char array like : ['p', 'i','p','e','l',i,'n','e']
		{
			if(word.indexOf(i)==word.lastIndexOf(i))
			{
				System.out.println("First Non Repated char is: "+i);
				break;
			}
		}

	}

}
//indexOf(p)-0 ==lastIndexOf(p) -2 = not matching  repeated char
//indexOf(l)-4 ==lastIndexOf(l) - 4 = both are equal so its not repeated.
//so l is the output.
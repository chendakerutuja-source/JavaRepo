package stringAssignment;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String word="pipeline";
		
		for(char i:word.toCharArray())
		{
			if(word.indexOf(i)==word.lastIndexOf(i))
			{
				System.out.println("The First Character which is not repeating is: "+i);
				break;
			}
		}

	}

}
// toCharArray() method is used to convert a string into a character array.

//Explanation:
//word.toCharArray = ['p', 'i', 'p', 'e', 'l', 'i', 'n', 'e']
//for(char i:word.toCharArray())
//1.i='p'
//indexOf(p)=0 == word.lastIndexOf(p)=2   // it is like so here we have p twice so for the first p index is 0 and for second repeated p index is 2 okay both are not matching so its not non repeated chat if index matching then its repeated one
//indexOf(i)=1 == word.lastIndexOf(i)=5 //its repeated because index are not matching
//indexOf(p)=0 == word.lastIndexOf(p)=2 //repeated
//indexOf(e)=3 == word.lastIndexOf(e)=7 //repeated , index not matching
//indexOf(l)=4 == word.lastIndexOf(l)=4  // non-repeated , index matching
//hence l is the output.
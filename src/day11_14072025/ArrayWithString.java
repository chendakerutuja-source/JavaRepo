package day11_14072025;

public class ArrayWithString {

	public static void main(String[] args) {
		String[] b= {"Rutuja", "Poornima", "Veera", "Swati", "Abhishek"}; // Once we gave array size during runtime we can modify example is now here we have 5 values so once u gave values size will be fixed and if u index out side of limit it will throw error
		for(int i=0;i<b.length;i++) // instead of giving hardcoded value we can use .length as well so all the time we no need to change the value it will take automatically the length of the array if we use .length
		{
			System.out.print(b[i] +" ");
		}

	}

}

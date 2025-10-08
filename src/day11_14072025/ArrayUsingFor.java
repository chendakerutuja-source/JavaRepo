package day11_14072025;

public class ArrayUsingFor {

	public static void main(String[] args) {
		int[] a=new int[5]; //5 is the length of the array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<5;i++) //so we are going with for loop,loop will run and all values will be printed one by one
		{
			System.out.print(a[i] + " "); //if need values in single line don't use ln and just concat with space, values will be printed in single line
		}
	}

}

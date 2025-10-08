package day11_14072025;

public class ArrayUsingForEach {

	public static void main(String[] args) {
		int[] a=new int[5]; //5 is the length of the array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i:a) // Here no need of initialization because a will go and seat in i everyone and once there is no value in index loop will stop automatically.
		{
			System.out.print(i + " "); //if need values in single line don't use ln and just concat with space, values will be printed in single line
		}

	}

}

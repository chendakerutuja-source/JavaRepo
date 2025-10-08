package day11_14072025;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a=new int[5]; //5 is the length of the array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[0]); //if we take in this way we need to execute one by one it will increase the line of code
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a.length); //Gives the length or size of the array
	}

}

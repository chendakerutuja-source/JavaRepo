package mon;

import java.util.Arrays;

public class SecondLargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		Arrays.sort(a);
		int length=a.length;
		
		System.out.println("Second Largest Number: "+a[length-2]);
		System.out.println("Smallest Number: "+a[0]);
	}

}

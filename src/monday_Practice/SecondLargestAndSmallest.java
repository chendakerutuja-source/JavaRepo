package monday_Practice;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] a= {7,8,3,5,6};
		Arrays.sort(a);
		int length=a.length;
		
		System.out.println("Second Largest: "+a[length-2]);
		System.out.println("Smallest: "+a[0]);

	}

}

package sun_Prac_21092025;

import java.util.Arrays;

public class SecondLargestAndSmallestElementInArray {

	public static void main(String[] args) {
		int[] a= {1,65,78,8,9};
		Arrays.sort(a);
		int length=a.length;
		
		System.out.println("Second Largest Number is: "+a[length-2]);
		System.out.println("Smallest number: "+a[0]);

	}

}

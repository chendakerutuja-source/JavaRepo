package arrayAssignment;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int num[] = {23, 67, 88, 90, 45};
		Arrays.sort(num); //used to sort an array in ascending order.
		int length=num.length;
		
		System.out.println("Second Largest Number: "+num[length-2]);
		System.out.println("Smallest Number: "+num[0]);

	}

}

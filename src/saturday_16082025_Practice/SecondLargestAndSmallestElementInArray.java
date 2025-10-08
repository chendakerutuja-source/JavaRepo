package saturday_16082025_Practice;

import java.util.Arrays;

public class SecondLargestAndSmallestElementInArray {

	public static void main(String[] args) {
		int num[]= {7,3,5,6,9};
		Arrays.sort(num);
		int length=num.length;
		
		System.out.println("Second Largest Number: "+num[length-2]);
		System.out.println("Smallest Number: "+num[0]);
				
				

	}

}

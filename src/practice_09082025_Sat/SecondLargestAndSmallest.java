package practice_09082025_Sat;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] num= {34,23,11,10,67,88,99,45};
		Arrays.sort(num);
		int length=num.length;
		
		System.out.println("Second largest number: " +num[length-2]);
		System.out.println("Smallest Num: " +num[0]);
		

	}

}

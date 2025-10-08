package tuesday_02092025;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] num= {8,3,5,6,7};
		Arrays.sort(num);
		int length=num.length;
		
		System.out.println("Second largest Number: "+num[length-2]);
		System.out.println("Smallest Number: "+num[0]);

	}

}

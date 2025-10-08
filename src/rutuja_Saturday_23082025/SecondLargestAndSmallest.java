package rutuja_Saturday_23082025;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] num= {9,6,7,2,5};
		int length=num.length;
		Arrays.sort(num);
		
		System.out.println("Second Largest: "+num[length-2]);
		System.out.println("Smallest: "+num[0]);

	}

}

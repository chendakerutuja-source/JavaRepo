package friday_Practice_29082025;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] num= {1,6,7,8,9};
		Arrays.sort(num);
		int length=num.length;
		
		System.out.println("Largest Element in Array: "+num[length-2]);
		System.out.println("Smallest Element in Array: "+num[0]);

	}

}

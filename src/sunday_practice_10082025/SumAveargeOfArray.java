package sunday_practice_10082025;

public class SumAveargeOfArray {

	public static void main(String[] args) {
		int[] numbers= {5,6,7,8,9,10,11,12};
		int sum=0;
		double average;
		
		for(int i:numbers)
		{
			sum=sum+i;
		}
		System.out.println("Sum of array: "+sum);
		
		average=(double)sum/numbers.length;
		
		System.out.println("Average of Array: "+average);
	}

}

package sun_Prac_21092025;

public class SumAndAverageOfArray {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		int sum=0;
		double average;
		
		for(int i:numbers)
		{
			sum=sum+i;
		}

		System.out.println("Sum of an array: "+sum);
		average=(double)sum/numbers.length;
		System.out.println("Average of an array: "+average);
	}

}

package mon;

public class SumAndAverageOfArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sum=0;
		double average;
		
		for(int i:a)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of an array is: "+sum);
		
		average=(double)sum/a.length;
		
		System.out.println("Average of an array is: "+average);

	}

}

package tuesday_02092025;

public class SumAndAverageOfArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int sum=0;
		double average;
		
		for(int i=1;i<=a.length;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of an Array: "+sum);
		
		average=(double)sum/a.length;
		
		System.out.println("Average of an array: "+average);

	}

}

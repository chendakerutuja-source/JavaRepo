package saturday_16082025_Practice;

public class SumAverageOfArray {

	public static void main(String[] args) {
		int[] a= {4,5,6,8,9,10};
		int sum=0;
		double average;
		
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println("sum of an array: "+sum);
		average=(double)sum/a.length;
		System.out.println("Average of an array: "+average);

	}

}

package rutuja_Saturday_23082025;

public class SumAndAverageArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sum=0;
		double average;
		
		for(int i=0;i<=a.length;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		average=(double)sum/a.length;
		System.out.println(average);

	}

}

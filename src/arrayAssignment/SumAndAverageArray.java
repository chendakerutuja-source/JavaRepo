package arrayAssignment;

public class SumAndAverageArray {

	public static void main(String[] args) {
		int [] numbers= {10,20,30,40,50};
		int sum=0;
		double average;
		
		for(int i:numbers)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum Of Array elements: "+sum);
		
		average=(double)sum/numbers.length;
		
		System.out.println("Average of Array elements: "+average);

	}

}

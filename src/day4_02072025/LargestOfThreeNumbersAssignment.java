package day4_02072025;

public class LargestOfThreeNumbersAssignment {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=3;
		if(a>=b && a>=c)
		{
			System.out.println("Largest Number is: "+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("Largest Number is: "+b);
		}
		else if(c>=a && c>=b)
		{
			System.out.println("Largest Number is: "+c);
		}

	}

}

package saturday_16082025_Practice;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=0;
		
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

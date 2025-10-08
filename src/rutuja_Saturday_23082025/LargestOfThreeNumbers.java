package rutuja_Saturday_23082025;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=9;
		int b=11;
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

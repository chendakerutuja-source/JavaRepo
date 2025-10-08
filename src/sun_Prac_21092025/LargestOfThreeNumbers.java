package sun_Prac_21092025;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		int c=3;
		
		if(a>b && a>c)
		{
			System.out.println("Largest Number is: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest Number is: "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("Largest Number is: "+c);
		}
		

	}

}

package mon;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=664;
		int reverse=0;
		int i=1;
		int original=num;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number is: "+reverse);
		
		if(original==reverse)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is NOT Palindrome");
		}

	}

}

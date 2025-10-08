package practices;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=545;
		int reverse=0;
		int original=num;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
		if(original==reverse)
		{
			System.out.println("Given Number is palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}

	}

}

package friday_Practice_29082025;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=111;
		int reverse=0;
		int original=num;
		int i=1;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
		if(original==reverse)
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its Not palindrome");
		}

	}

}

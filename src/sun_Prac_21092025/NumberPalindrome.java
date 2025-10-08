package sun_Prac_21092025;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=131;
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
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is Not a palindrome");
		}

	}

}

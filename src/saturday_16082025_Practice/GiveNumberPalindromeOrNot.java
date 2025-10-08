package saturday_16082025_Practice;

public class GiveNumberPalindromeOrNot {

	public static void main(String[] args) {
		int num=121;
		int reverse=0;
		int original=num;
		int i=0;
		
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
		
		if(original==reverse)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is Not Palindrome");
		}

	}

}

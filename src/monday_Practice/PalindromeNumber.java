package monday_Practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=101;
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
			System.out.println("Its Palindrome"); 
		}
		else
		{
			System.out.println("Its Not palindrome");
		}
			


	}

}

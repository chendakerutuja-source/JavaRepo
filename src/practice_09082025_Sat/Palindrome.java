package practice_09082025_Sat;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
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
			System.out.println("Its a Palindrome");
		}
		else
		{
			System.out.println("Its Not a Palindrome");
		}
	}

}

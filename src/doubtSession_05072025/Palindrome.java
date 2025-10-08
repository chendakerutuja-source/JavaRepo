package doubtSession_05072025;

public class Palindrome {

	public static void main(String[] args) {
		int num=111;
		int original=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10; //gives you Remainder
			reverse=reverse*10+digit;
			num=num/10; //gives you quotient
			
		}
		System.out.println(reverse);
		if(original==reverse)
		{
			System.out.println("Its a Palindrome");
		}
		else
		{
			System.out.println("Its NOT a Palindrome");
		}

	}

}

// Palindrome meaning is If you read the number backward and forward number should be same.
package rutuja_Saturday_23082025;

public class Palindrome {

	public static void main(String[] args) {
		int num=123;
		int reverse=0;
		int original=num;
		
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number: "+reverse);
		
		if(original==reverse)
		{
			System.out.println("Given Number Is Palindrome");
		}
		else
		{
			System.out.println("Given Number is Not Palindrome");
		}
	}

}

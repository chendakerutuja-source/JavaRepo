package sun;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=323;
		int reverse=0;
		int original=num;
		int i=1;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number is: "+reverse);
		
		if(original==reverse)
		{
			System.out.println("Given Number is palindrome");
		}
		else
		{
			System.out.println("Number is Not palindrom");
		}

	}

}

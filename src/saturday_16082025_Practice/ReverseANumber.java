package saturday_16082025_Practice;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=456;
		int reverse=0;
		int i=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);

	}

}

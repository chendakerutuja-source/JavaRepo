package doubtSession_05072025;

public class ReverseOfANumber {

	public static void main(String[] args) {
		int num=121;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10; //Given you Remainder
			reverse=reverse*10+digit;
			num=num/10; //Gives You Quotient
		}
		System.out.println(reverse);

	}

}

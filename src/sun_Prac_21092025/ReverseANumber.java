package sun_Prac_21092025;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=123;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number is:"+reverse);
		

	}

}

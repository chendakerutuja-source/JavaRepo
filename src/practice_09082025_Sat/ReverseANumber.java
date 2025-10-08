package practice_09082025_Sat;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=12345678;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
		

	}

}

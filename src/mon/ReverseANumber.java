package mon;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=876;
		int reverse=0;
		int i=1;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number is: "+reverse);

	}

}

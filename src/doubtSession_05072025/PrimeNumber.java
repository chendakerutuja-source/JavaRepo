package doubtSession_05072025;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=3;
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Its a Prime Number");
		}
		else
		{
			System.out.println("Its Not a Prime Number");
		}

	}

}

//Prime number is nothing but the number which is divisible by 1 and itself called prime number

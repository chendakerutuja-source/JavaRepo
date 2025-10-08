package rutuja_Saturday_23082025;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=10;
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
			System.out.println("Given Number is Prime");
		}
		else
		{
			System.out.println("Given Nunber is Not prime");
		}
	}

}

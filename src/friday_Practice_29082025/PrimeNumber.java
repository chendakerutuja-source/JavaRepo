package friday_Practice_29082025;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=11;
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
			System.out.println("its Prime");
		}
		else
		{
			System.out.println("Its Not Prime");
		}
		
		

	}

}

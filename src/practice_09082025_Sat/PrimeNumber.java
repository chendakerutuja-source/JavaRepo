package practice_09082025_Sat;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=9;
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
			System.out.println("Its Prime");
		}
		else
		{
			System.out.println("Its Not a Prime");
		}
		}
	}



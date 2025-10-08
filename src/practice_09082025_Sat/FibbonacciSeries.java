package practice_09082025_Sat;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=9;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}

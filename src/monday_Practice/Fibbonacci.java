package monday_Practice;

public class Fibbonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}

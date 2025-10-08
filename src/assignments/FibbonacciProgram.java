package assignments;

public class FibbonacciProgram {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<9;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}

//Fibbonacci meaning : Each number is sum of the two previous numbers.
//Ex: 0+1 =1
//    1+1=2
//    1+2=3
//    2+3=5
//    3+5=8
//    5+8=13
//    8+13=21
//    13+21=34

package practice_09082025_Sat;

public class Factorial {

	public static void main(String[] args) {
		int num=0;
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of " +num+ " Is: " +fact);

	}

}

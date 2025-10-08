package friday_Practice_29082025;

public class Factorial {

	public static void main(String[] args) {
		int num=4;
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);

	}

}

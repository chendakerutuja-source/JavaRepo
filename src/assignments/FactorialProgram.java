package assignments;

public class FactorialProgram {

	public static void main(String[] args) {
		int num=4;
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
        System.out.println("Fcatorial of " + num + " is " + fact);
		
	}

}

// Factorial meaning : 5=5x4x3x2x1=120
// 4 Factorial : 4x3x2x1=24
// Factorial for 1 is always 1! = 1
// Factorial of 0 is always 0! = 1 (by definition)

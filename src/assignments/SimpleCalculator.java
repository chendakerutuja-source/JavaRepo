package assignments;

public class SimpleCalculator {

	public static void main(String[] args) {
		int operator='+';
		int a=4;
		int b=3;
		switch(operator)
		{
		case '+':
			System.out.println("Add="+(a+b));
			break;			
		case '-':
			System.out.println("sub="+(a-b));
			break;			
		case '*':
		    System.out.println("Mul="+(a*b));
		    break;	    
		case '/':
			System.out.println("Div="+(a/b));
			break;			
		default:
				System.out.println("Invalid Choice");
		}

	}

}

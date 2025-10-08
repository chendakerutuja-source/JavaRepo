package code_imp;

// Java program to swap two numbers without using third variable

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		System.out.println("Before Swapping a: " +a+ ", b: "+b);
		a=a+b; // a=5+10; in a 15 will be stored.
		b=a-b; // b=15-10 in b 5 will be stored.
		a=a-b; // a=15-5 in a 10 will be stored. 
		System.out.println("After Swapping a: "+a +" ,b:"+b);

	}

}

package day7_08072025;

import java.util.Scanner;

public class PalindromeScannerAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int original=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10; //Given you Remainder
			reverse=reverse*10+digit;
			num=num/10; //Gives you Quotient
		}
		
		if(original==reverse)
		{
			System.out.println("Its a Palindrome");
		}
		else 
		{
			System.out.println("Its NOT a Palindrome");
		}

	}

}

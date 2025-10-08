package day24_06082025;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		
		if(age<18)
		{
			throw new VotingAgeException("Minor Age");
		}
		else
		{
			System.out.println("Congratulations!! you are eligible to Vote");
		}

	}

}

//after throw we can write any code , it wont allow
//throw is nothing we can create as per user rule exception
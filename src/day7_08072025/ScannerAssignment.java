package day7_08072025;

import java.util.Scanner;

public class ScannerAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name=sc.nextLine();
		System.out.println("My Name Is: "+name);
		
		System.out.println("Enter You Age: ");
		int age=sc.nextInt();
		System.out.println("My Age Is: "+age);
		
		System.out.println("Enter Byte Value: ");
		byte b=sc.nextByte();
		System.out.println("The Byte Value Is "+b);
		
		System.out.println("Enter The Short Value: ");
		short s=sc.nextShort();
		System.out.println("The Short Value is: "+s);
		
		System.out.println("Enter The Phone Number: ");
		long Number=sc.nextLong();
		System.out.println("My Phone Number is: "+Number);
		
		System.out.println("My Height Is: ");
		float Height=sc.nextFloat();
		System.out.println("My Height Is: "+Height);
		
		System.out.println("My Weight Is: ");
		double Weight=sc.nextDouble();
		System.out.println("My Weight Is: "+Weight);
		
		System.out.println("I am Preety");
		boolean B=sc.nextBoolean();
		System.out.println("I am Preety: "+B);

	}

}

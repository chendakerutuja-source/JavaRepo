package day7_08072025;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
//		String name=sc.next(); // this is not a good to use because after space it will take to next data type so use nextLine always.
		String name=sc.nextLine();
		System.out.println("My Name Is: "+name);
		
		System.out.println("Enter You Age: ");
		int age=sc.nextInt();
		System.out.println("My Age Is: "+age);

	}

}

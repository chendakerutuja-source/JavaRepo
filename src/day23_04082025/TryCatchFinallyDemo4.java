package day23_04082025;

import java.util.Scanner;
import java.util.TreeSet;

public class TryCatchFinallyDemo4 {

	public static void main(String[] args) {
		try
		{
			System.out.println("1");
			System.out.println("2");
//			System.exit(0); //It will stop the execution after above 2 print statements even finally also wont be executed.
//			System.out.println(10/0); //Exception error
//			System.out.println("3");
//			TreeSet ts=new TreeSet();
//			ts.add(null);
			
			Scanner sc=new Scanner(System.in);
			sc.nextInt();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block 1");
			System.out.println(e); // it will print exception error message
//			e.printStackTrace();// Used to print exception error in console - it will give u details which line error is present
//			System.out.println(e.getMessage()); //Used to print exception error in console - it will give u description f exception error
//			System.out.println(e.toString());//Used to print exception error in console - it same as syso(e)
			//above are the 4 ways to get exception error in console
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Catch Block 2");
			System.out.println(e); // it will print exception error message
//			e.printStackTrace();// Used to print exception error in console - it will give u details which line error is present
//			System.out.println(e.getMessage()); //Used to print exception error in console - it will give u description f exception error
//			System.out.println(e.toString());
		}
		
		catch(ClassCastException e)
		{
			System.out.println("Catch Block 3");
			System.out.println(e); // it will print exception error message
//			e.printStackTrace();// Used to print exception error in console - it will give u details which line error is present
//			System.out.println(e.getMessage()); //Used to print exception error in console - it will give u description f exception error
//			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println("Catch Block 4");
			System.out.println(e); // it will print exception error message
//			e.printStackTrace();// Used to print exception error in console - it will give u details which line error is present
//			System.out.println(e.getMessage()); //Used to print exception error in console - it will give u description f exception error
//			System.out.println(e.toString());
			
			// this is parent exception all the exception handled by parent Exception
		}
		System.out.println();  // we can write anything in between try catch and finally we can resolved this by adding try.
		try
		{
			System.out.println("Error Gone");
		}
		finally
		{
			try
			{
				int a=10/0;
			}
			catch(Exception e)
			{
				System.out.println("Nested Catch");
				System.out.println(e);
			}
			finally
			{
				System.out.println("Nested Finally");
			}
			//Nested try catch finally this is valid
			System.out.println("Finally Block");		
		}
		
		System.out.println("Last Line Of Execution");
	

	}

}

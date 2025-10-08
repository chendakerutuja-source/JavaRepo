package day23_04082025;

public class TryCatchFinallyDemo2 {

	public static void main(String[] args) {
		try
		{
			//Risky Code
			System.out.println("1");
			System.out.println("2");
			System.out.println(10/0); //Exception error
			System.out.println("3");
		}
		catch(Exception e) //Lawyer
		{
			//Handling Code
			System.out.println("Catch Block");
			System.out.println(e); // it will print exception error message
		}
		finally //Loving Wife
		{
			//Clean Up Code
			System.out.println("Finally Block");		
		}
		
		System.out.println("Last Line Of Execution");
	}

}

// Whenever there is exception in try block Catch is going to execute , so real life example is like whenever husband(try) has problem in his life he will go to his first wife that is catch
//Finally will execute all time

//Real Life example Try(Husband) will do murder and first wife(Catch) she will be lawyer she will help husband to release from case and second wife(finally) will clear all evidence so basically both help try to come out of the thing or his mess.

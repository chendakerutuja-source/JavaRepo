package day23_04082025;

public class TryCatchFinallyDemo3 {

	public static void main(String[] args) {
		try
		{
			System.out.println("1");
			System.out.println("2");
			System.out.println(10/0); //Exception error
			System.out.println("3");
		}
		/*catch(Exception e)
		{
			System.out.println("Catch Block");
			System.out.println(e); // it will print exception error message
		}*/
		finally
		{
			System.out.println("Finally Block");		
		}
		
		System.out.println("Last Line Of Execution");
	}

}

//here we have exception in try block so will get exception error and finally will be executed in all cases and last line of execution wont be executed as we have exception error in try will terminate the code

package day23_04082025;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		try
		{
			System.out.println("1");
			System.out.println("2");
			System.out.println(10/2);
			System.out.println("3");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
			System.out.println(e); // it will print exception error message
		}
		finally
		{
			System.out.println("Finally Block");		
		}
		
		System.out.println("Last Line Of Execution");
	}

}

//If try don't have any exception error then catch wont be executed, Real Life example is like husband(try) is selfish
//Finally will be executed in all case no matter what.
//Sequence should be as above only, Catch should be after try

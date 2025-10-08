package day19_29072025;

public class ThisCallingMethodDemo {
	
	ThisCallingMethodDemo() //Default Constructor
	{
		System.out.println("Cons 1");
	}

	ThisCallingMethodDemo(int a) //Parameterized Constructor
	{
		this(); //this will call Cons 1 because in this we didn't passed in arguments
		System.out.println("Cons 2");
	}
	
	ThisCallingMethodDemo(String a) //Parameterized Constructor
	{
		this(10); //this will call Cons 2 because in this we have passed int arguments
		System.out.println("Cons 3");
	}
	
	public static void main(String[] args) {
		ThisCallingMethodDemo td=new ThisCallingMethodDemo("Rutuja"); //In case of Constructor if we create object automatically Constructor will be executed.No need to call like how we will do for methods
 //2.here whats's happening is we passed String in Constructor so it Cons 3 and in that we gave this without parameters so it will execute cons 1 and 3
	//3. we have passed Parameters in Cons 3 as 10 so it will be executing all 3 because in constructor we have passed Rutuja string so it will go and execute Cons 3 and in Cons we have passed in this parameter as int that is 10 so it will go and execute cons 2 as well so in cons 2 we have this without parameters so all 3 will be executed.
		//so is this the way to execute multiple constructors with only one object creation.
	}

}

package day17_25072025;

public class MethodOverLoadingDemo {
	
	public void display(String b, int a) //here we are creating 2 methods with same name and in same class but we have to give different parameters if we gave in same sequence or same parameter will be getting error.
	{
		System.out.println("Method 1");
	}
	
	public void display(int a, String b)
	{
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		MethodOverLoadingDemo mo=new MethodOverLoadingDemo(); //Created object for class
//		mo.display(); // if u gave method without parameters then all the time first method only will be executed because both will be same method so by default first will be executed
		
		mo.display(10,"ANVI"); //calling the methods.
		mo.display("Jyothi", 33);

	}

}

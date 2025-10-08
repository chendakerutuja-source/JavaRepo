package day19_29072025;

class Dad//Creating parent class
{
	public Dad(int a) //Method
	{
		System.out.println("Dad Cons");
	}
}

public class SuperCallingMethodDemo extends Dad { //Inheritance
	
	SuperCallingMethodDemo()  //Default Constructor
	{
		super(10); //we are calling parent class using super keyword as super keyword take care of parent class
		System.out.println("Child Cons");
	}
	
	public static void main(String[] args) {
		SuperCallingMethodDemo sd=new SuperCallingMethodDemo();

	}

}

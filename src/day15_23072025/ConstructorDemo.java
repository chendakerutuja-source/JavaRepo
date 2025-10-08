package day15_23072025;

public class ConstructorDemo {
	
	public ConstructorDemo() // This is Constructor, here we can NOT use any Return_Type like void string int etc , only access modifiers are applicable for constructors those are public, private, default and protected.
	{
		System.out.println("Constructor with No arguments or called as Default Constructor"); //This is Default Constructor
	}
	
	public ConstructorDemo(int a, String b, boolean b1) //Parameterized Constructor, we can pass as many as parameters u want
	{
		System.out.println("My age is: "+a+"-->"+b+"----->"+b1);
	}
	
	String a; // it will give the default value of String that is null
	int c; //it will give the default value of int that is 0

	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo(); //here will just create the object then constructor automatically will be executed no need to call like how we will call for methods.
		ConstructorDemo cd1=new ConstructorDemo(33, "Jyothi", true);
		System.out.println(cd.a); //u can use cd or cd1 because we have 2 object here any one you can pick
		System.out.println(cd1.c); //u can use cd or cd1 because we have 2 object here any one you can pick

	}

}

package day21_31072025;

interface I1  //Parent Class
{
	public static final int a=10;  // any variable will declare that will be considered as Final only.even if we are not mentioning as Final it will consider as final only.
	public abstract void display(); //If we are not metionining access modifier as Public by default it will take as Public
	
	default void show() // Very Imp- Only in Interface if we are using default method we have use "default" Keyword mandetorly
	{
		System.out.println("Default Concrete Method");
	}
	
	public static void add()
	{
		System.out.println();
	}
	
	private void sub()
	{
		System.out.println("New Change");
	}
}

interface I2
{
	
}

class Mom
{
	
}


public class InterfaceDemo extends Mom implements I1,I2 {
	
	public void display()
	{
		System.out.println("My Method"); //Only in inheritance loose coupling will happen meaning is if we have same methods in diff class that is method overriding and meaning of loose coupling is whatever changes are happening in Parent class it wont impact child class it child class overrides with parent classes.
	}

	public static void main(String[] args) {
		
//		I1 i=new I1(); //We can NOT create Object for Interface - Real Life ex: Handcuff parent
		I1 i2=new InterfaceDemo(); //creating object parent with class
		InterfaceDemo id=new InterfaceDemo(); //created object for child class
		System.out.println(a); //we are able to call a here directly because its static
		I1.add(); // we can call these methods using interface 
		id.display();
		

	}

}

//in code Object Name should be Unique

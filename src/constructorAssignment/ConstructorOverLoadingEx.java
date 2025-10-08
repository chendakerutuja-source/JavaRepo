package constructorAssignment;

public class ConstructorOverLoadingEx {
	
	public ConstructorOverLoadingEx()
	{
		System.out.println("Default");
	}
	
	public ConstructorOverLoadingEx(int age, String name)
	{
		System.out.println("My Age Is: "+age+ " And My Name is: "+name);
	}
	
	// Above is Constructor Overloading as here we have same constructor in same class with different parameters.

	public static void main(String[] args) {
		ConstructorOverLoadingEx c=new ConstructorOverLoadingEx();//Default will be executed
		ConstructorOverLoadingEx c1=new ConstructorOverLoadingEx(25,"Rutuja");//Parameterized Constructor will be executed
	}

}

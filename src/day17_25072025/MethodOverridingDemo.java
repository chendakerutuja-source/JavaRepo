package day17_25072025;

class Parent  //Created Parent Class
{
	String nm="Rutuja";
	public void show() //Created Method for Parent Class
	{
		System.out.println("Parent Method");
		String s="Jyoti";
	}
}

public class MethodOverridingDemo extends Parent { //Child Class
	
	String nm="Veera";
	
	public void show() //Created method for child class
	{
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		MethodOverridingDemo mod=new MethodOverridingDemo();
		mod.show();
		

		//Important Interview Question
		// we can create object parent with child Ex below
		Parent p=new MethodOverridingDemo();
		p.show(); //here child class will be executed because method overrides.
		System.out.println(p.nm); //here String from Parent class will be executed because only method Overrides Not the Variables.
	}

}

// In Method Overriding we will be creating same method but in different class but with same parameters.and all the time Child class only will be executed because will be having latest changes in Child class or all the implementation will be in Child class

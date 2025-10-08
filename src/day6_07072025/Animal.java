package day6_07072025;

public class Animal {
	
	public void run()
	{
		System.out.println("I'm Running");
	}
	
	public void bark()
	{
		System.out.println("I'm Barking");
	}
	
	public String name(String nm)
	{
		System.out.println("My Name is: "+nm);
		return nm;
	}
	
	public int age(int ag)
	{
		System.out.println("My Age is: "+ag);
		return ag;
	}
	
	public static void main(String[] args) {
		Animal dog=new Animal();
		dog.bark();
		dog.run();
		dog.age(2);
		dog.name("Mac");
		dog.age(6);
		dog.name("Sheru");
		dog.age(1);
		

	}

}

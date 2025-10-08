package day6_07072025;

public class AnimalAssignment {
	
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
	
	public boolean act (boolean ac)
	{
		System.out.println("Dog Is eating: "+ac);
		return ac;
	}
	
	public float height(float ht)
	{
		System.out.println("Height of the dog is: "+ht);
		return ht;
	}

	public long owner(long ow)
	{
		System.out.println("Mobile Number of Owner: "+ow);
		return ow;
	}
	
	public double weight(double wi)
	{
		System.out.println("Weight of the Dog is: "+wi);
		return wi;
	}
	
	public static void main(String[] args) {
		AnimalAssignment dog = new AnimalAssignment();
		dog.bark();
		dog.run();
		dog.age(2);
		dog.name("Mac");
		dog.age(6);
		dog.name("Sheru");
		dog.age(1);
		dog.act(true);
		dog.height(5.0f);
		dog.owner(9686017380L);
		dog.weight(50.0);
		

	}

}

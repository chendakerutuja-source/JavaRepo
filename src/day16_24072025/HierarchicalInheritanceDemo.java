package day16_24072025;

class Dad //Parent/Superclass 
{
	public void d() //Method created for Parent class
	{
		System.out.println("Dad Method");
	}
}

class Sis extends Dad //Child/Subclass 
{
	public void s() //Method created for This Child Class
	{
		System.out.println("Sis Method");
	}
}

class Bro extends Dad //Child/Subclass 
{
	public void b() //Method created for This Child Class
	{
		System.out.println("Bro Method");
	}
}

public class HierarchicalInheritanceDemo extends Dad { //Child/Subclass 
	
	public void my() //Method created for This Child Class
	{
		System.out.println("Mine Method");
	}

	public static void main(String[] args) {
		Dad d=new Dad(); //Objected created for Parent Class
		d.d(); //Calling d method, parent class can access only their method
		
		Sis s=new Sis(); //Object Created for Sis Child class
		s.d(); //This child class can access parent class and their own class but they can NOT access other class like siblings they can access.
		s.s();
		
		Bro b=new Bro();//Object Created for Bro Child class
		b.d(); //This child class can access parent class and their own class but they can NOT access other class like siblings they can access.
		b.b();
		
		HierarchicalInheritanceDemo hid=new HierarchicalInheritanceDemo(); //Object Created for my (HierarchicalInheritanceDemo) Child class
		hid.d(); //This child class can access parent class and their own class but they can NOT access other class like siblings they can access.
		hid.my();
	}

}

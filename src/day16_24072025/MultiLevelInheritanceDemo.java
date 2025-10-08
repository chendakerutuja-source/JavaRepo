package day16_24072025;

class Grandfather //Parent Class
{
	public void gf() //Created method for Parent Class
	{
		System.out.println("GrandFather Method");
	}
}

class Father extends Grandfather //Child Class
{
	public void f() //Created method for Child Class
	{
		System.out.println("Father Method");
	}
}

public class MultiLevelInheritanceDemo extends Father { //Child Class
	public void me() //Created method for Child Class
	{
		System.out.println("Mine Method");
	}

	public static void main(String[] args) {
		Grandfather gf=new Grandfather(); //parent class can only access parent class
		gf.gf();
		
		Father ft=new Father(); //This child class can access both Grandfather class and their own class
		ft.gf();
		ft.f();

		
		MultiLevelInheritanceDemo mil=new MultiLevelInheritanceDemo(); //This child class can access all classes Grandfather class, Father class and their own class as called below
		mil.gf();
		mil.f();
		mil.me();
	}

}

// Real Life Example is like Grandfather will be having 3 houses okay so father will get same 3 houses and his own 2 houses will be there so total I will be having 5 houses..

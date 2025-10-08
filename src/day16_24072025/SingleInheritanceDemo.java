package day16_24072025;

class Papa     //here papa is super class /parent class
{
	public void papaMethod() //we have created method in papa class
	{
		System.out.println("Papa Method");
	}
}

public class SingleInheritanceDemo extends Papa { //this is subclass nothing but child class and we are using extends keyword to achieve the inheritance

	public static void main(String[] args) {
		Papa p=new Papa(); //object created for parent class - papa class
		p.papaMethod();		//parent class can access only parent class
		SingleInheritanceDemo sid=new SingleInheritanceDemo(); //Object created for child class
		sid.papaMethod();	//Child can access both papa class and their own class nothing but can access both superclass and subclass	
	}

	
}

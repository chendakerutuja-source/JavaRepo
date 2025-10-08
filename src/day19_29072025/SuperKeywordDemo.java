package day19_29072025;

class PitaShree  //Created parent class with Default access modifier
{
	int a=30;
}

public class SuperKeywordDemo extends PitaShree { //inheritance
	
	int a=20; //Declaring Global Variable
	
	public void display()
	{
		int a=10; //Declaring Local Variable
		System.out.println(a);
		System.out.println(this.a); //it will call global variable
		System.out.println(super.a); //Super Keyword take care of parent class objects.
	}

	public static void main(String[] args) {
		SuperKeywordDemo skd=new SuperKeywordDemo(); //Creating object 
		skd.display(); //Calling display method using object
	}

}

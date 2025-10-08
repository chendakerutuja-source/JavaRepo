package day19_29072025;

class Papa
{
	public final void show()
	{
		System.out.println("Parent Child");
	}
}

public class FinalKeywordDemo extends Papa{
	
	final int a=20;
	
	public void show() // we are getting error because Parent class is defined with Final keyword and we can not call it in child class
	{
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		FinalKeywordDemo fd=new FinalKeywordDemo();
		System.out.println(fd.a);
//		fd.a=30;  // meaning is we can NOT modify whatever defined with Final keyword
		System.out.println(fd.a);
		fd.show();	
	}

}

// Meaning is if we use Final keyword we can NOT modify anything may it be variable, method or constructor

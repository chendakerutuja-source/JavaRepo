package day19_29072025;

public class ThisKeywordWithMethods {
	
	public void show()
	{
		System.out.println("Method 1");
	}
	
	public void display(int a, String b)
	{
		this.show();
		System.out.println("Method 2");
	}
	

	public static void main(String[] args) {
		ThisKeywordWithMethods tkw=new ThisKeywordWithMethods();
		tkw.display(10,"Rutuja");
		

	}

}

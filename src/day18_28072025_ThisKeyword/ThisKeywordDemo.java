package day18_28072025_ThisKeyword;

public class ThisKeywordDemo { 
	
	int a; //Global Variable
	
	public void show(int a) //Method
	{
		this.a=a; //This keyword is used for when we have same variable name for both local and global.
		System.out.println("Value of a: "+a);
	}

	public static void main(String[] args) {
		ThisKeywordDemo tkd=new ThisKeywordDemo();
		System.out.println(tkd.a);
		tkd.show(10);
		System.out.println(tkd.a);

	}

}

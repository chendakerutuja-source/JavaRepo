package day18_28072025;

public class WithinTheClass {
	
	private void privateMethod()  //methods created
	{
		System.out.println("This Is Private Method");
	}
	
	void defaultMethod()
	{
		System.out.println("This is Default Method");
	}

	protected void protectedMethod()
	{
		System.out.println("This is Protected Method");
	}
	
	public void publicMethod()
	{
		System.out.println("This is Public Method");
	}
	
	public static void main(String[] args) {
		WithinTheClass wc=new WithinTheClass(); //Object Created
		wc.privateMethod(); //Calling the method
		wc.defaultMethod();
		wc.protectedMethod();
		wc.publicMethod();

	}

}

package constructorAssignment;

public class AccessModifiers {
	
	private void privateMethod()  //methods created
	{
		System.out.println("This Is Private Method");
	}
	
	public void publicMethod()
	{
		System.out.println("This is Public Method");
	}

	public static void main(String[] args) {
		AccessModifiers a=new AccessModifiers();
		a.privateMethod();
		a.publicMethod();
		
		// we can access both Private and Public here as private can be accessible only within that class and public can be accessible from any where
		

	}

}

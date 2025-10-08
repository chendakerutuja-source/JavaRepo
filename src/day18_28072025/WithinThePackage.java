package day18_28072025;

public class WithinThePackage {

	public static void main(String[] args) {
		WithinTheClass wtc=new WithinTheClass(); //As we are calling methods from different class we are creating object for that class
		wtc.defaultMethod(); //Calling methods of different class
		wtc.protectedMethod();
		wtc.publicMethod();

	}

}

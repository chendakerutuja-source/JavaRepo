package day18;

import day18_28072025.WithinTheClass; //we have to create import as we are calling code from different package

public class OutSidePackageBySubClass extends WithinTheClass{ //this child class using parent as WithinTheClass

	public static void main(String[] args) {
		OutSidePackageBySubClass opc=new OutSidePackageBySubClass(); //creating object for Child class
		opc.protectedMethod(); //calling methods from WithinTheClass class.
		opc.publicMethod();
	}

}

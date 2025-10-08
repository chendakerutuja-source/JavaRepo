package day18;

import day18_28072025.WithinTheClass; //we have to create import as we are calling code from different package

public class OutSidePackage {

	public static void main(String[] args) {
		WithinTheClass w=new WithinTheClass(); //Created object for the class which is in different class
		w.publicMethod(); //calling method
	}

}

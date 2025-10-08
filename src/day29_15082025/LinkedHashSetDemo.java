package day29_15082025;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(59);
		lhs.add(87);
		lhs.add("Jyoti");
		lhs.add(null);
		lhs.add(59);
		lhs.add(87);
		lhs.add("Jyoti");
		lhs.add(null);
		System.out.println(lhs);

	}

}

//Follows Insertion order
//Wont accept duplicate values

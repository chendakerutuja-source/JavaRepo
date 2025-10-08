package day29_15082025;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(59);
		hs.add(87);
		hs.add("Jyoti");
		hs.add(null);
		hs.add(59);
		hs.add(87);
		hs.add("Jyoti");
		hs.add(null);
		System.out.println(hs);

	}

}

// Doesn't follow insertion order, give random value
// Wont accept Duplicate value
// Accept only one null value.

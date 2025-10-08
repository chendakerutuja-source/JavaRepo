package day27_13082025;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(); //predefined so we have imported.
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(al.get(0)); // will use to get index - get(0) will give the value present at 0th index that is 10.
		System.out.println(al.get(3)); // gives the value present at 3rd index.
		al.set(2, "Jyoti"); //It will replace index 2 with Jyoti. so output will be [10, 20, Jyoti, 40].
		System.out.println(al);
		System.out.println(al.indexOf(40)); //It will give the index info for this mentioned value so output will be 3.
		System.out.println(al.indexOf(20)); //It will give the index info for this mentioned value so output will be 1.
	}

}

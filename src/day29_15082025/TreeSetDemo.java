package day29_15082025;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(59);
		ts.add(87);
		ts.add(33);
		ts.add(59);
		ts.add(87);
		ts.add(33);
//		ts.add("Jyoti");
//		ts.add(null);
		System.out.println(ts);

	}

}

//TreeSet doesn't support null
//data type should be same for all values.
//TreeSet follows Ascending Order.
//does Not allow duplicates
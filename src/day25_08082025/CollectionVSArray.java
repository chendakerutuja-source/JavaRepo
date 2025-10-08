package day25_08082025;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionVSArray {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		
		CollectionVSArray obj1=new CollectionVSArray();
		CollectionVSArray obj2=new CollectionVSArray();
		CollectionVSArray obj3=new CollectionVSArray();
		
		CollectionVSArray[] ca= {obj1,obj2,obj3};
		
		Collection c=new ArrayList(); //collection is interface so we cant create object for it so creating with the help of child that is ArrayList
		c.add(20);
		c.add(10);
		c.add("Jytoti");
		c.add(12.23);
		System.out.println(c);
		
		// above are collection objects, collection is like non primitive not exactly but we can pass any data here its not specific.
		

	}

}

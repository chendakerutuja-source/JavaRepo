package day26_11082025;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection c=new ArrayList(); // we cant create object for collection as it is interface so we need to create object for child so Arraylist is the child of collection
        c.add(10);
        c.add(12.36);
        c.add("Jyoti");
        c.add(true);
        
        System.out.println(c);
        
        Collection c1=new ArrayList();
        c1.add(100);
        c1.add(200);
        c1.add(c); //so just add will go and add above data of c as single element Ex: [10, 12.36, Jyoti, true]
        c1.addAll(c); // addAll will add as separate element ex: 10, 12.36, Jyoti, true]
        c1.add(98.36);
        System.out.println(c1);
        System.out.println(c.contains(100)); //if it contains then it returns true
        System.out.println(c1.containsAll(c)); //it will check if elements present separately then only it will return true
        System.out.println(c1.isEmpty()); // checks whether is empty or what
        c1.remove(100);//removes 100 from c1.
        System.out.println(c1);
        c1.remove(c); //it removes c from c1.it removes single elements that is : [10, 12.36, Jyoti, true] this will be removed from c1.
        System.out.println(c1);
        c1.removeAll(c); // now it will be removing separate elements. that is: 10, 12.36, Jyoti, true - will be removed.
        System.out.println(c1);
        System.out.println(c1.size()); //gives size
        c1.clear(); // clears all data present
        System.out.println(c1);
        System.out.println(c1.isEmpty());//returns true now as no data present now.
	}

}

package day26_11082025;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(10);
		s.add(96);
		s.add(100);
		s.add(33);
		s.add(10);
		s.add(96);
		s.add(100);
		s.add(33);// Set will NOT take duplicate elements.
		s.add(null);
		s.add(null);
		s.add(null);
		System.out.println(s); // Set will print data randomly.
		
		for(Object o:s)
		{
			System.out.println(o);
		}
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

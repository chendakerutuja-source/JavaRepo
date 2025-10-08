package day27_13082025;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector(); //created object for vector - its predefined thatswy we have imported
		v.add(10);
		v.add(60);
		v.add(20);
		v.add(98);
		
		System.out.println(v);
		Enumeration e=v.elements(); // created object for Enumeration - its predefined thatswy we have imported
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}

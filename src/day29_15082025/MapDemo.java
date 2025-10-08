package day29_15082025;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, 30000);
		m.put(101, 450000); 
		m.put(102, 230000);
		m.put(103, 5000);
		System.out.println(m); // it will take latest value for 101 object key.
		System.out.println(m.get(102)); // it will give the value which is present on that object key.

	}

}

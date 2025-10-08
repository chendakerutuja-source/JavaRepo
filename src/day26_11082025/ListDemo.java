package day26_11082025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(96);
		l.add(100);
		l.add(33);
		l.add(10);
		l.add(96);
		l.add(100);
		l.add(33); //List will print duplicate data/elements.
		l.add(null);
		l.add(null);
		l.add(null);
		System.out.println(l); // List will print serial wise how we passed data in above so it will take in same format.

		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));  // to get index we need to use get(i)
		}
		
		Iterator itr=l.iterator();
		while(itr.hasNext())  // hasNext will work like First cursor will above first number then it will check has next yes then it will print.
		{
			System.out.println(itr.next());
		}
		
		System.out.println("==============ListIterator===============");
		ListIterator litr=l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("==============ListIterator===============");
		ListIterator litr1=l.listIterator(2); //we have to mention index here so that cursor will start from there 
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
		
	}

}

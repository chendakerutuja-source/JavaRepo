package day29_15082025;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(60);
		ad.offer(69);
		ad.offer(72);
		ad.offer(33);
		ad.offerFirst(75); // 75 will be added first now.
		ad.addLast(82); // 82 will be added last.
		System.out.println(ad);
		ad.removeFirst(); // first will be removed
		System.out.println(ad);
		ad.removeFirst();// now 60 will be removed - its not like whichever value you are adding with addfirst that will be removed, even though we are not adding with addfirst , first value will be removed. same logic goes wit last as well.
		System.out.println(ad);
		ad.removeLast(); // it will remove last value.
		System.out.println(ad);
		ad.removeLast(); // now 33 will be removed
		System.out.println(ad);
		
	}

}
// it follows insertion order.
package day29_15082025;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(); // PriorityQueue is class we can create constructor for it.
		pq.offer(30);
		pq.add(5);
		pq.add(98);
		pq.add(45);
		System.out.println(pq);
		System.out.println(pq.peek()); // it will give smallest data on first peek.
		pq.poll(); //it will be removing smallest peek first
		System.out.println(pq);

	}

}
// it will take smallest value first then later it will take data randomly.
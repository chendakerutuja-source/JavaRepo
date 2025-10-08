package day29_15082025;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(Comparator.reverseOrder()); // If we want to remove largest value we have use "Comparator.reverseOrder() in constructor. then it will reverse the order means largest value will be first
		pq.offer(30);
		pq.add(5);
		pq.add(98);
		pq.add(45);
		System.out.println(pq);
		System.out.println(pq.peek()); //gives the first largest peek value
		pq.poll();  // removes the largest peek value.
		System.out.println(pq);


	}

}

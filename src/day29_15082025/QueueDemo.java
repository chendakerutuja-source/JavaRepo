package day29_15082025;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q=new PriorityQueue(); //Queue is interface so we cant create object for it, so creating with the help of child that is Priority queue.
		q.offer(10); // we can use offer as well as we can use add. both are same.
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q);
		System.out.println(q.peek()); // it will be data which entered first - first peek.
		q.poll(); // it will remove the first data./first peek.
		System.out.println(q);
		System.out.println(q.peek()); // now it will be data which entered second - second peek.
		q.poll(); // now it will remove the second data./second peek.
		System.out.println(q);

	}

}
// Queue is First In First Out.

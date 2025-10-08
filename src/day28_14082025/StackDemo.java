package day28_14082025;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack(); //Stack is class so we can add direct object for it. - with these we can go with any data type
		
		// we can define stack in below way as well: 
//		Stack<String> s=new Stack<String>(); // if we want to deal specifically with string data we can go with string
//		Stack<Integer> s=new Stack<Integer>(); // if we want to deal specifically with Integer data we can go with Integer
		s.add("Rutuja");
		s.add(10);
		s.add(20);
		s.add(30); // instead add we can use push as well like
		s.push(12);
		s.add(40); // for all these we can take any object like string int etc.
		System.out.println(s);
		System.out.println(s.peek()); // it will give the data which is on peak so all the time first will be removed - peak will give targeted data. that is 40 here.
		System.out.println(s);
		s.pop(); // it will remove the first targeted data that is 40 so output will be [Rutuja,10, 20, 30,12]
		System.out.println(s);
		s.pop(); // it will remove the next/second targeted data that is 12. so output will be [Rutuja,10, 20, 30]
		System.out.println(s);

	}

}

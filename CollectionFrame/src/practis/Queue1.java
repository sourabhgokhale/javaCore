package practis;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	
	public static void main(String[] args) {
		

	
	Queue q1 = new LinkedList();    
	
	q1.add(2);
	q1.add(55);
	q1.add(56);
	q1.add(57);
	q1.offer(515);
	q1.offer(251);
	
	System.out.println(q1);
	System.out.println(q1.element()); // FIFO
	System.out.println(q1);
	System.out.println("__________________________");
	System.out.println("Pool "+ q1.poll());
	System.out.println(q1);
	System.out.println("____________---------------");
	System.out.println("Peek " + q1.peek()); // first element ko peek (utha leta he )
	System.out.println(q1);
	
	/**System.out.println(q1.poll());
	System.out.println(q1.poll());
	System.out.println(q1.poll());
	System.out.println(q1.poll());
	System.out.println(q1.poll());
//System.out.println(q1.peek());
//System.out.println(q1.peek());**/
	
	
		System.out.println();
	}
}

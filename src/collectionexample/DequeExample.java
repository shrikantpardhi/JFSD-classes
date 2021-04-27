package collectionexample;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> numbers = new ArrayDeque<>();
		
		numbers.offer(2);
//        numbers.addLast(4);
        numbers.offer(-1);
        numbers.offer(-5);
        numbers.offer(5);
        numbers.offer(6);
        numbers.add(3);
        
        System.out.println("Queue: " + numbers);
        System.out.println("Queue: " + numbers.peek());  //return head
        System.out.println("Queue poll: " + numbers.poll());  //remove head
        System.out.println("Queue: head after poll; " + numbers.element());  //return head
        
	}

}

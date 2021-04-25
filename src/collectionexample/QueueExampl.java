package collectionexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(2);
        numbers.offer(4);
        numbers.add(3);
        
        System.out.println("Queue: " + numbers);
        System.out.println("Queue: " + numbers.peek());
        System.out.println("Queue: " + numbers.poll());
        System.out.println("Queue: " + numbers.element());
        
        System.out.println("Queue: " + numbers.poll());
        System.out.println("Queue: " + numbers.poll());
        System.out.println("Queue: " + numbers.peek());
//        System.out.println("Queue: " + numbers.element());

	}

}

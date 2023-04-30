//Java program to create a queue of 56,30,70

package demo;

import java.util.LinkedList;

public class Queue {
	
    public static void main(String[] args) {
        // Creating a new linked list to implement queue
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Enqueue elements onto the queue using addLast method (which acts as enqueue operation)
        queue.addLast(56);
        queue.addLast(30);
        queue.addLast(70);

        // Printing the queue
        System.out.println("Queue: " + queue);
    }
}

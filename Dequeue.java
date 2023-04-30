//Java program to dequeue from the beginning till it is empty 

package demo;

import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        // Creating a new linked list to implement queue
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Enqueue elements onto the queue using addLast method (which acts as enqueue operation)
        queue.addLast(56);
        queue.addLast(30);
        queue.addLast(70);

        // Printing the queue
        System.out.println("Queue: " + queue);

        // Dequeue an element from the beginning of the queue using remove() method
        int dequeued = queue.remove();
        System.out.println("Dequeued element: " + dequeued);

        // Printing the queue after dequeuing an element
        System.out.println("Queue after dequeue: " + queue);

        // Dequeue another element from the beginning of the queue using remove() method
        int dequeued2 = queue.remove();
        System.out.println("Dequeued element: " + dequeued2);

        // Printing the queue after dequeuing another element
        System.out.println("Queue after dequeue: " + queue);

        // Dequeue the last element from the beginning of the queue using remove() method
        int dequeued3 = queue.remove();
        System.out.println("Dequeued element: " + dequeued3);

        // Printing the queue after dequeuing the last element
        System.out.println("Queue after dequeue: " + queue);

        // Printing a message indicating that the queue is empty
        System.out.println("Queue is empty");
    }
}

//Java program to peek and pop element from the stack till it is empty

package demo;

import java.util.LinkedList;

public class Stack2 {
	
    public static void main(String[] args) {
        // Creating a new linked list to implement stack
        LinkedList<Integer> stack = new LinkedList<Integer>();

        // Adding elements onto the stack using addFirst method (which acts as push operation)
        stack.addFirst(70);
        stack.addFirst(30);
        stack.addFirst(56);

        // Printing the stack
        System.out.println("Stack: " + stack);

        // Peek (to get top element) at the top element of the stack using getFirst method
        int top = stack.getFirst();
        System.out.println("Top element: " + top);

        // Popping elements from the stack using removeFirst method until it's empty
        while (!stack.isEmpty()) {
            int popped = stack.removeFirst();
            System.out.println("Popped element: " + popped);
        }

        // Printing the stack after popping all elements
        System.out.println("Stack after popping all elements: " + stack);
    }
}

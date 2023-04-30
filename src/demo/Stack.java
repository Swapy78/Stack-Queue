//Java program to create a stack of 56,30,70

package demo;

import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {
        // Creating a new linked list to implement stack
        LinkedList<Integer> stack = new LinkedList<Integer>();

        // Adding elements onto the stack using addFirst method (which acts as push operation)
        stack.addFirst(70);
        stack.addFirst(30);
        stack.addFirst(56);

        // Printing the stack
        System.out.println("Stack: " + stack);

    }
}

package linkedlist;

import java.util.NoSuchElementException;

/**
 *
 * @author Alula
 */
public class Stack<T> {
    //use the list class here to start the queue

    private LinkedList<T> stack;

    // constructor uses the list 
    public Stack() {
        stack = new LinkedList<T>("Stack");

    }

    // call the insert at the back method of the list (code re-use)
    public void push(T object) {
        stack.insertAtback(object);
    }

    // remove an atem from the Queue
    public T pop() throws NoSuchElementException {
        return stack.removeFromBack();
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // print all the list items
    public void show() {
        stack.show();

    }

}

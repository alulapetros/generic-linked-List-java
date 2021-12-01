package linkedlist;

import java.util.NoSuchElementException;

/**
 *
 * @author Alula
 */
public class Queue<T> {

    //use the list class here to start the queue
    private LinkedList<T> queueList;

    // constructor uses the list 
    public Queue() {
        queueList = new LinkedList<T>("Queue");

    }

    // call the insert at the back method of the list (code re-use)
    public void enqueue(T object) {
        queueList.insertAtback(object);
    }

    // remove an atem from the Queue
    public T deQueue() throws NoSuchElementException {
        return queueList.removeFromfront();
    }

    // check if the que is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // print all the list items
    public void show() {
        queueList.show();

    }

}

package linkedlist;

/**
 *
 * @author Alula
 */
public class Driver {

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>("My List");
        myList.show();
        myList.insertAtFront(12);
        myList.insertAtFront(52);
        myList.insertAtFront(72);
        myList.insertAtFront(56);
        myList.show();
        myList.insertAtback(45);
        myList.insertAtback(46);
        myList.insertAtback(47);
        myList.show();
        System.out.printf("Removed last item: %s\n", myList.removeFromBack());
        myList.show();
        System.out.printf("Removed first item: %s\n", myList.removeFromfront());
        myList.show();
        System.out.printf("Remove item from the middle: %s\n", myList.removeItem(12));
        myList.show();
        myList.removeItem(17);
        myList.show();
        System.out.println("------------------------------------Queue------------------------------------------------");
        Queue<Integer> myQueue = new Queue<>();
        myQueue.enqueue(100);
        myQueue.enqueue(230);
        myQueue.enqueue(450);
        myQueue.enqueue(430);
        myQueue.enqueue(870);
        myQueue.show();
        myQueue.deQueue();
        myQueue.show();
        System.out.println("------------------------------------Stack------------------------------------------------");
        Stack<Integer> myStack = new Stack<>();
        myStack.push(100);
        myStack.push(23);
        myStack.push(189);
        myStack.push(78);
        myStack.show();
        myStack.pop();
        myStack.show();

    }

}

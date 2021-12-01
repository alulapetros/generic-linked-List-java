package linkedlist;

import java.util.NoSuchElementException;

/**
 *
 * @author Alula
 */
public class LinkedList<T> {
    // -------------------------the linked list class ---------------------------------------------------

    private Node<T> firstNode;// stores the first link
    private Node<T> lastNode;// stores the last link
    private Node<T> previosNode; // stores the previos node relative to the current node
    private String listName;// the name of the link

    // create an empty list with just the name of the List
    public LinkedList(String name) {
        this.firstNode = null;
        this.lastNode = null;
        this.listName = name;
    }

    // add a item at the front of the list
    public void insertAtFront(T insertItem) {
        //check if tge list is empty and create the very first node
        if (isEmpty()) {
            firstNode = lastNode = new Node<T>(insertItem);
        } else {
            // if there is already a node in the list, make the new node the first node
            firstNode = new Node<T>(insertItem, firstNode);
        }
    }

    // add item at the back of the list
    public void insertAtback(T insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new Node<T>(insertItem);
        } else {// last node's next node refers to the new node, and the new node is now the last node
            lastNode = lastNode.nextNode = new Node<T>(insertItem);
        }
    }

    //remove an element from the front
    public T removeFromfront() throws NoSuchElementException {
        // if the list is empty
        if (isEmpty()) {
            throw new NoSuchElementException(listName + " is Empty");
        }

        T removedItem = firstNode.data;

        // if the list has only one record
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;

        }
        return removedItem;
    }

    // remove an element from the Back
    public T removeFromBack() throws NoSuchElementException {
        // if no element in the list
        if (isEmpty()) {
            throw new NoSuchElementException(listName + " is empty");
        }
        T removedItem = lastNode.data;

        // if only one element in the list
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } //if more than one element 
        else {
            //start from first node and loop untill the last node
            Node<T> current = firstNode;

            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }

            // the item before the last node is now the new last node
            lastNode = current;
            current.nextNode = null; // set the next node of the last node to null because it is the last node
        }

        return removedItem;

    }

    // a method to remove an item from a list at any position
    public T removeItem(T itemRemove) throws NoSuchElementException {
        T removedItem = null;
        if (isEmpty()) {
            throw new NoSuchElementException(listName + " is empty");
        }

        // if only one element in the list
        if (firstNode == lastNode) {
            if (itemRemove == firstNode.data) {
                removedItem = firstNode.data;
                firstNode = lastNode = null;
            }
            //if more than one element in the list
        } else {

            Node<T> current = firstNode;

            while (current != lastNode && current.data != itemRemove) {
                previosNode = current;
                current = current.nextNode;
            }

            if (current.data == itemRemove) {
                removedItem = current.data;
                previosNode.nextNode = current.nextNode;

            } else {
                System.out.printf("\"%s\" is not found in %s \n", itemRemove, listName);
            }

        }

        return removedItem;

    }

    // a method to print the list
    public void show() {
        if (isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        Node<T> current = firstNode;

        while (current != null) {
            System.out.printf("%s, ", current.data);
            current = current.nextNode;
        }
        System.out.println();
    }

    // check if first Node exists, if not the list is empty
    public boolean isEmpty() {
        return this.firstNode == null;

    }

//---------------------------------------Node Class -------------------------------------------------------
// create the nodes to be linked
    private class Node<T> {

        private T data; // represents data to be stored
        private Node<T> nextNode; // represents reference for the next node in the list

        // first node constructor
        public Node(T object) {
            this.data = object;
            this.nextNode = null;
        }

        // constructor to be used after the first Node is created
        public Node(T data, Node<T> node) {
            this.data = data;
            this.nextNode = node;
        }

        // sets the data
        public void setData(T data) {
            this.data = data;
        }

        // returns the reference to data in node
        public T getData() {
            return data;
        }

        // returns the reference to the next node
        public Node<T> getNextNode() {
            return nextNode;
        }

    }// end of Node class
}

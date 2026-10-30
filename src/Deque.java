import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A double-ended queue that supports adding and removing items at either end.
 * @param <Item> the type of items stored in this deque
 */
public class Deque<Item> implements Iterable<Item> {

    /** A node in the doubly linked list. */
    private class Node {
        Item item;
        Node next;
        Node prev;
    }

    private Node head;
    private Node tail;
    private int size;

    /** Construct an empty deque. */
    public Deque() {
        head = new Node();
        tail = new Node();
        size=0;
        // TODO: Initialize an empty linked list.
    }

    /** Return whether the deque is empty. */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** Return the number of items in the deque. */
    public int size() {
        // TODO: Return this linked list's item count.
        return size;
    }

    /** Add an item to the front; reject null items with IllegalArgumentException. */
    public void addFirst(Item item) {
        Node temp = new Node();
        temp.item = item;
        Node a = head;
        temp.next = a;
        head = temp;
        size++;

        // TODO: Create a node and link it at the front; update head/tail pointers.
    }

    /** Add an item to the back; reject null items with IllegalArgumentException. */
    public void addLast(Item item) {
        Node temp = new Node();
        temp.item = item;
        Node a = tail;
        tail.next = a;
        tail = a;
        size++;
        // TODO: Create a node and link it at the back; update head/tail pointers.
    }

    /** Remove and return the front item; throw NoSuchElementException if empty. */
    public Item removeFirst() {
        if (size >= 1) {
            head = head.next;
        }
        // TODO: Remove the front node and update head/tail pointers.
        return null;
    }

    /** Remove and return the back item; throw NoSuchElementException if empty. */
    public Item removeLast() {
        if (size >= 1) {
            tail.prev = tail;
        }
        // TODO: Remove the back node and update head/tail pointers.
        return null;
    }

    /** Return an iterator from front to back; next() and remove() follow the specified exceptions. */
    @Override
    public Iterator<Item> iterator() {
        // TODO: Return an iterator that follows next links from head to tail.
        return null;
    }

    private class DequeIterator implements Iterator<Item>{
        private Node current = head.next;
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }
    }

    /** Run unit tests for the deque. */
    public static void main(String[] args) {
        // TODO: Add unit tests.
    }
}

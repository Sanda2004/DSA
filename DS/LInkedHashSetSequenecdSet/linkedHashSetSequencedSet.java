package list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Sandali
 */

public class LinkedHashSetSequencedSet<T> implements Iterable<T> {

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedHashSetSequencedSet() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add element (only if not already present)
    public boolean add(T data) {
        if (contains(data)) return false;

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    // Remove element if present
    public boolean remove(T data) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Check if set contains data
    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    // Size of the set
    public int size() {
        return size;
    }

    // Is the set empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // Print elements in insertion order
    public void printSet() {
        Node current = head;
        System.out.print("Set: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}


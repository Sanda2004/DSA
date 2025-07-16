
package list;

/**
 *
 * @author Sandali
 */
public class linkedlist <T> {
 
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    private int size;

    public linkedlist() {
        head = null;
        size = 0;
    }

    // Add element at the beginning
    public void add(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Remove a specific element
    public boolean remove(T data) {
        if (head == null) return false;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data.equals(data)) {
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
             curr = curr.next;
        }
        return false;
    }
            
            
     // Check if the collection contains a value
    public boolean contains(T data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data.equals(data)) return true;
            curr = curr.next;
        }
        return false;
    }

    // Return the size of the collection
    public int size() {
        return size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all elements
    public void printAll() {
        Node curr = head;
        System.out.print("Collection: ");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
            
            
}


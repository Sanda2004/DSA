
package list;

/**
 *
 * @author Sandali
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class delete_beginning {
    
      static Node deleteHead(Node head) {
        if (head == null)
            return null;

        Node temp = head;

        head = head.next;

        temp = null;

        return head;
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(12);
        head.next.next = new Node(15);
        head.next.next.next = new Node(18);
        head = deleteHead(head);
        printList(head);
    }
}


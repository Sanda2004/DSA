package list;

/**
 *
 * @author Sandali
 */

class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class delete_posittion {
    
    public static Node deleteNode(Node head, int position){
        Node temp = head;
        Node pre = null;
        
        if(temp == null)
            return head;
        
        if(position ==1){
            head = temp.next;
            return head;
        }
        
      for (int i = 1; temp != null && i < position; i++) {
            pre = temp;
            temp = temp.next;
        }
      
      if (temp != null) {
            pre.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }
      
      return head;
    }
    
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(3);
        head.next.next = new Node(9);
        
        System.out.print("Original list: ");
        printList(head);
        
        int position = 2;
        head = deleteNode(head, position);
        
        System.out.print("List after deletion: ");
        printList(head);
    }
    
    
}

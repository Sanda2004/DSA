
package list;

/**
 *
 * @author Sandali
 */

class Node{
    int data;
    Node next;
    
    Node(int new_data){
        data = new_data;
        next = null;
    }
}
public class insert_begining {
    
    public static Node insertFront(Node head, int new_data){
        Node new_node = new Node(new_data);
        
        new_node.next = head;
            
        return new_node;
    }
    
    public static void printList(Node head){
        Node current = head;
        
        while(current!=null){
            System.out.print(""+current.data);
            
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    Node head = new Node(2);
    head.next = new Node(7);
    head.next.next = new Node(4);

    System.out.print("Original list: ");
    printList(head);

    int data = 5;
    head = insertFront(head, data);

    System.out.print("After inserting at front: ");
    printList(head);
}

}


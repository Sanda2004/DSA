
package list;

/**
 *
 * @author Sandali
 */

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class delete_end {
    public static Node remove_last(Node head){
        
        if(head == null){
            return null;
        }
        
        if(head.next ==null){
            return null;
        }
        
        Node secondLast = head;
        while(secondLast.next.next !=null){
            secondLast = secondLast.next;           
        }
        secondLast.next = null;
        return head;
    }
    
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        System.out.println("list:");
        printList(head);
        
        head = remove_last(head);
        
        System.out.println("after deleting last:");
        printList(head);
    }
}


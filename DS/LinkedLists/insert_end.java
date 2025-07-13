package list;

/**
 *
 * @author Sandali
 */
class Node{
    int data;
    Node next;
    
    Node(int newData){
        data = newData;
        next= null;
    }
}
public class insert_end {
    
    static Node Insert_last(Node head, int newData){
        
        Node newNode = new Node(newData);
        
        if (head == null){
            return newNode;
        }
        
        Node last = head;
        
        while (last.next !=null){
            last = last.next;         
        }
        last.next = newNode;
        return head;
    }
    
    public static void printList(Node node){
        while(node != null){
            System.out.print(""+node.data);
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(8);
        head.next.next = new Node(4);
        
        System.out.println("print list:");
        printList(head);
        
        head = Insert_last(head, 6);
        
        
        System.out.println("print list after inserting at the end:");
        printList(head);
    }
    
}



package list;

/**
 *
 * @author Sandali
 */

class Node{
    int data;
    Node next;
    
    Node(int new_data){
        this.data = new_data;
        this.next =null;
    }
}
public class traversal {
    
    public static void traverseList(Node current){
        
        while(current!=null){
            System.out.println(current.data+"");
            
            current = current.next;                 
        }
    }
    
    public static void main(String[] args) {
        Node current = new Node(10);
        current.next = new Node(20);
        current.next.next = new Node(30);
        
        
        traverseList(current);
    }
}


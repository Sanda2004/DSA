
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
public class searchlist {
    
    static boolean searchkey(Node head, int key){
        Node current = head;
        
        while(current !=null){
            
            if(current.data ==key)
                return true;
            
            
            current = current.next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node head = new Node(34);
        head.next = new Node(78);
        head.next.next = new Node(25);
        head.next.next.next = new Node(30);
        
        int key = 78;
        
        if(searchkey(head, key))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}


package list;

/**
 *
 * @author Sandali
 */

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}

public class insert {
    
    static Node insertPosition(Node head, int pos, int data){
        if(pos <1)
            return head;
        
        if(pos==1){
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }
        
        Node curr = head;
        
        for(int i=1; i<pos -1 && curr !=null; i++){
            curr = curr.next;
        }
        
        if(curr==null)
            return head;
        
        Node newNode = new Node(data);
        
        newNode.next = curr.next;
        curr.next = newNode;
        
        return head;
    }
    
    static void printList(Node node){
        while(node !=null){
            System.out.print(node.data+"");
            node = node.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(8);
        head.next.next = new Node(3);
        
        int data = 12, pos=3;
        head = insertPosition(head, pos, data);
        printList(head);
    }
}


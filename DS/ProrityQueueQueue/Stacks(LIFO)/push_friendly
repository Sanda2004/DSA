package stacks;

import java.util.*;

/**
 *
 * @author Sandali
 */

//PUSH FRIENDLY METHOD | POP COSTLY

public class pushfriendly {
   static class Stack{
       // built 2 queues
       Queue<Integer> q1 = new LinkedList<>();
       Queue<Integer> q2 = new LinkedList<>();
       
       void remove(){
           if(q1.isEmpty()){
               return;
           }
           
           //leave one element in q1 and
           // push other in q2
           while(q1.size() != 1){
               q2.add(q1.peek());
               q1.remove();
           }
           //pop the only left element 
           //from q1
           q1.remove();
           
           //swap the names of 2 queues
           Queue<Integer> q = q1;
           q1 = q2;
           q2 = q;
           
       }
       
       void add(int x){
           q1.add(x);
       }
       
       int top(){
           if (q1.isEmpty()){
               return -1;
           }
           
           while (q1.size()!=1){
               q2.add(q1.peek());
               q1.remove();
           }
           
           // last pushed elements
           int temp = q1.peek();
           
           //to empty the quxiliary queue after
           //last operation
           q1.remove();
           
           //push last element to q2
           q2.add(temp);
           
           //swap the 2 queues names
           Queue<Integer> q = q1;
           q1 = q2;
           q2 = q;
           return temp;
       }
       
       int size(){
           return  q1.size();
       }
       
       public static void main(String[] args) {
           Stack s = new Stack();
           s.add(1);
           s.add(2);
           s.add(3);
           
           System.out.println("current size: "+s.size());
           System.out.println("current top: "+s.top());
           s.remove();
           System.out.println("top after popping: "+s.top());
           System.out.println("size"+s.size());
       }
   }
}
 


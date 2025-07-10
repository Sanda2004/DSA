package stacks;
import java.util.*;

/**
 *
 * @author Sandali
 */
//POP FRIENDLY METHOD | PUSH COSTLY
public class popfriendly {
    
  static class Stack{
 //build 2 queues
      static Queue<Integer> q1 = new LinkedList<>();
      static Queue<Integer> q2 = new LinkedList<>();
      
      // to maintain the current number of 
      // elements
      static int curr_size;
      
      static void push(int x){
          //push x 1st in empty q2
          q2.add(x);
          
          //push all the remaining
          //elements in q1 to q2
          while(!q1.isEmpty()){
              q2.add(q1.peek());
              q1.remove();
          }
          
          //swap the names of 2 queues
          Queue<Integer> q = q1;
          q1 = q2;
          q2 = q;
      }
      
      static void pop(){
          //if no elements are there in q1
          if(q1.isEmpty()){
              return;
          }
          q1.remove();
      }
      
      static int top(){
          if (q1.isEmpty()){
              return -1;             
          }
         return q1.peek();
      }
      
      static int size(){
          return q1.size();
      }
      
      public static void main(String[] args) {
          Stack s = new Stack();
          s.push(1);
          s.push(6);
          s.push(4);
          
          System.out.println("current size:" + s.size());
          System.out.println("current top"+s.top());
          s.pop();
          System.out.println("top after poping"+s.top());
          System.out.println("current size"+ s.size());
                 
      }
      
  }    

  }




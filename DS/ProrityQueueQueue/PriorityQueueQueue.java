public class priorityqueue {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
        
        queue.add(2.4);
        queue.add(5.2);
        queue.add(4.0);
        
        System.out.println("PriorityQueue: " + queue);
        
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    
}

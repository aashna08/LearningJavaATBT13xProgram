package ex_14_Queue;

import java.util.PriorityQueue;

public class Queue001 {
    public static void main(String[] args) {
        PriorityQueue q =new PriorityQueue();
        q.add("Aashna");
        q.add("Happy");
        System.out.println(q);
        System.out.println(q.peek()); // retrieves head of the queue
        System.out.println(q);
        System.out.println(q.poll()); //retrieves and remove head of the queue
        System.out.println(q);
    }
}

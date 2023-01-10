package com.company;
import java.util.*;

public class PriorityQueueFramework {
    public static void main(String[] args) {
     PriorityQueue<Integer> priorityqueue=new PriorityQueue<>();

     priorityqueue.offer(30);
     priorityqueue.offer(20);
     priorityqueue.offer(10);
     priorityqueue.offer(40);
     System.out.println( priorityqueue);

     System.out.println(priorityqueue.poll());
     System.out.println( priorityqueue);
     System.out.println(priorityqueue.peek());
    }
}

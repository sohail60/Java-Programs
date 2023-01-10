package com.company;
import java.util.*;

public class QueueFramework {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(50);
        queue.offer(100);
        queue.offer(150);
        queue.offer(200);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }
}

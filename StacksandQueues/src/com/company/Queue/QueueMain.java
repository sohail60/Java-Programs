package com.company.Queue;

import java.util.*;

public class QueueMain {
    public static void main(String[] args) throws Exception{
//        CircularQueue circularQueue=new CircularQueue();
//        circularQueue.insert(10);
//        circularQueue.insert(20);
//        circularQueue.insert(25);

//        System.out.println(circularQueue.remove());
//        System.out.println(circularQueue.remove());
//        System.out.println(circularQueue.remove());

//        circularQueue.display();

//        DynamicQueue dynamicQueue=new DynamicQueue();
//        dynamicQueue.insert(10);
//        dynamicQueue.insert(20);
//        dynamicQueue.insert(25);
//
//        System.out.println(dynamicQueue.remove());
//        System.out.println(dynamicQueue.remove());
//        System.out.println(dynamicQueue.remove());
//
//        dynamicQueue.display();

        QueueUsingTwoStacks2 queue=new QueueUsingTwoStacks2();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}

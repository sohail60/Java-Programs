package com.company;

import java.util.ArrayDeque;

public class ArrayDequeFramework {
    public static void main(String[] args) {
        ArrayDeque<Integer> arraydeque=new ArrayDeque<>();

        arraydeque.offer(10);
        arraydeque.offerFirst(20);
        arraydeque.offerLast(30);
        arraydeque.offerFirst(40);

        System.out.println(arraydeque);

        System.out.println(arraydeque.peek());
        System.out.println(arraydeque.peekFirst());
        System.out.println(arraydeque.peekLast());

        System.out.println(arraydeque.poll());
        System.out.println(arraydeque);
        System.out.println(arraydeque.pollFirst());
        System.out.println(arraydeque);
        System.out.println(arraydeque.pollLast());
    }
}

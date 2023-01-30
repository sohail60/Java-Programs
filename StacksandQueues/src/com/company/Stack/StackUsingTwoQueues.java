package com.company.Stack;

import java.util.LinkedList;
import java.util.Queue;

//      In this we will implement Stack using the Queue provided in the Java Collections
    public class StackUsingTwoQueues {
        protected Queue<Integer> queue1;
        protected Queue<Integer> queue2;

    public StackUsingTwoQueues(){
        this.queue1=new LinkedList<>();
        this.queue2=new LinkedList<>();
    }

    public void push (int value) {
        queue2.offer(value);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp=new LinkedList<>();
        temp=queue1;
        queue1=queue2;
        queue2=temp;
    }

    public int pop() throws StackException{
        if(queue1.isEmpty()){
            throw new StackException("Stack is Empty");
        }
        return queue1.poll();
    }
}

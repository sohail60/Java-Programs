package com.company.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    protected Queue<Integer> queue;

    public StackUsingSingleQueue(){
        this.queue=new LinkedList<>();
    }

    public void push(int value){
        queue.offer(value);

        int i=queue.size();
        while (i>1){
            queue.offer(queue.poll());
            i--;
        }
    }

    public int pop() throws StackException{
        if(queue.isEmpty()){
            throw new StackException("Stack is Empty");
        }
        return queue.poll();
    }
}

package com.company.Queue;

import java.util.Stack;

public class QueueUsingTwoStacks1 {
    protected Stack<Integer> stack1;
    protected Stack<Integer> stack2;

    public QueueUsingTwoStacks1(){
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }

    public void offer(int value){
        while (!stack1.isEmpty()){
        stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int poll() {
        if (stack1.isEmpty()){
            return -1;
        }
        return stack1.pop();
    }

    public int peek() {
        if (stack1.isEmpty()){
            return -1;
        }
        return stack1.peek();
    }
}

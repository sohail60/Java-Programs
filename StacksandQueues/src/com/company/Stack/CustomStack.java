package com.company.Stack;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    protected static final int DEFAULT_SIZE=5;
    protected int ptr=0;

    public CustomStack(){
        this.data=new int[DEFAULT_SIZE];
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    public void push(int value) throws StackException {
        if(isFull()){
            throw new StackException("Stack is Full!!");
        } else {
        data[ptr++]=value;
        }
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty!!");
        } else {
            return data[--ptr];
//            The above is same as
//            ptr--;
//            return data[ptr];
        }
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new StackException("Stack is Empty!!");
        } else {
            int temp=--ptr;
            ptr++;
            return data[temp];
        }
    }

    public int length(){
        return ptr;
    }

    protected boolean isFull(){
        return ptr==data.length;
    }

    protected boolean isEmpty(){
        return ptr==0;
    }
}

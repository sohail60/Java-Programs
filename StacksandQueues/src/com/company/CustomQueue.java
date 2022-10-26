package com.company;

public class CustomQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE=5;
    protected int end=0;

    public CustomQueue(){
        this.data=new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public void insert(int value) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is Full!!");
        } else {
        data[end++]=value;
        }
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is Empty!!");
        } else {
            int removed=data[0];

            for (int i = 0; i < end-1; i++) {
                data[i]=data[i+1];
            }
            end--;
            return removed;
        }
    }

    public int front() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is Empty!!");
        } else {
            return data[0];
        }
    }

    public void display(){
        for (int i = 0; i < end; i++) {
        System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }

    protected boolean isFull(){
        return end==data.length;
    }

    protected boolean isEmpty(){
        return end==0;
    }
}
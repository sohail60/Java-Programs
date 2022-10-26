package com.company;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE=5;
    protected int front=0;
    protected int end=0;
    protected int size=0;

    public CircularQueue(){
        this.data=new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size){
        this.data=new int[size];
    }

    public void insert(int value) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is Full!!");
        } else {
            data[end]=value;
            end++;
            end=end%data.length;
            size++;
        }
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is Empty!!");
        } else {
            int removed=data[front];
            front++;
            front=front%data.length;
            size--;
            return removed;
        }
    }

    public int front() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is Empty!!");
        } else {
            return data[front];
        }
    }

    public void display() throws QueueException{
        if(isEmpty()) {
            throw new QueueException("Queue is Empty");
        }

        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    protected boolean isFull(){
        return size==data.length;
    }

    protected boolean isEmpty(){
        return size==0;
    }
}
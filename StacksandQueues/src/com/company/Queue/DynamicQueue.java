package com.company.Queue;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public void insert(int value) throws QueueException {
        if(isFull()){
            int[] temp=new int[data.length*2];

            int i = front;
            int j=0;
            do {
                temp[j]=data[i];
                j++;
                i++;
                i %= data.length;
            } while (i != end);

            front=0;
            end=data.length;
            data=temp;
        }

        super.insert(value);
//        data[end]=value;
//        end++;
//        end=end%data.length;
//        size++;
    }
}
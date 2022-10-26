package com.company;

public class DynamicStack extends CustomStack{

    DynamicStack(){
        super();    //It will call CustomStack()
    }

    DynamicStack(int size){
        super(size);    //It will call CustomStack(int size)
    }

    @Override
    public void push(int value){
        if(isFull()){
            int[] temp=new int[data.length*2];

            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
            data[ptr++]=value;
    }
}
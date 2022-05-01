package com.company;

public class ObjectDemo {

    int num;

    ObjectDemo(int n){
        this.num=n;
    }

    int hashcode(){
        return num;
    }

    public String toString(){
        return String.valueOf (num);
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(35);

        System.out.println(obj.hashcode());
        System.out.println(obj.toString());
    }
    }
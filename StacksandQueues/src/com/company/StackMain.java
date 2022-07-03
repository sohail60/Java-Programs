package com.company;

public class StackMain {

    public static void main(String[] args) throws StackException{

//        CustomStack customStack=new CustomStack();
//
//        customStack.push(10);
//        customStack.push(25);
//        customStack.push(30);
//        customStack.push(55);
//        customStack.push(70);
//
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());

        DynamicStack dynamicStack=new DynamicStack();

        dynamicStack.push(10);
        dynamicStack.push(20);
        dynamicStack.push(25);
        dynamicStack.push(35);
        dynamicStack.push(50);
        dynamicStack.push(85);

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
    }
}

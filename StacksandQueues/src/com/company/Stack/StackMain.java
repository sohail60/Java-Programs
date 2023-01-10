package com.company.Stack;

import java.util.*;

public class StackMain {

    public static void main(String[] args) throws StackException{

//        CustomStack customStack=new CustomStack();
//
//        customStack.push(10);
//        customStack.push(25);
//        customStack.push(30);
//
//        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());

//        DynamicStack dynamicStack=new DynamicStack();
//
//        dynamicStack.push(10);
//        dynamicStack.push(20);
//        dynamicStack.push(25);
//        dynamicStack.push(35);
//
//        System.out.println(dynamicStack.pop());
//        System.out.println(dynamicStack.pop());
//        System.out.println(dynamicStack.pop());
//        System.out.println(dynamicStack.pop());


        StackUsingSingleQueue stack=new StackUsingSingleQueue();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
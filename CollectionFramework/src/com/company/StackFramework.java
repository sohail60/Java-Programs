package com.company;
import java.util.*;

public class StackFramework {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Horse");

        System.out.println(animals);

        System.out.println(animals.peek());
        System.out.println(animals.pop());
    }
}

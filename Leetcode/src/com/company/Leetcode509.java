package com.company;

public class Leetcode509 {
    public static void main(String[] args) {

    }

    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
